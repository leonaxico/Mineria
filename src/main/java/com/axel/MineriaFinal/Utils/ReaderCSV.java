package com.axel.MineriaFinal.Utils;

import com.axel.MineriaFinal.Entity.*;
import com.axel.MineriaFinal.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
@Controller
public class ReaderCSV {
    @Autowired
    private CasoRepository casoRepository;
    @Autowired
    private DireccionRepository direccionRepository;
    @Autowired
    private EscolaridadRepository escolaridadRepository;
    @Autowired
    private EstadoCivilRepository estadoCivilRepository;
    @Autowired
    private OcupacionRepository ocupacionRepository;
    @Autowired
    private OrigenRepository origenRepository;
    @Autowired
    private ServicioRepository servicioRepository;
    @Autowired
    private TemaRepository temaRepository;
    @Autowired
    private TemasCasoRepository temasCasoRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    @RequestMapping("load")
    public void readCSV(){
        String fileName = "/home/leonaxico/Downloads/linea-mujeres.csv";
        String splitter = ",";
        BufferedReader br = null;
        String line = "";
        try {
            br = new BufferedReader(new FileReader(fileName));
            int counter=0;
            while ((line = br.readLine()) != null) {
                if (counter == 0){
                    System.out.println(line);
                }
                else{
                    System.out.println(counter);
                String[] data = line.split(splitter);
                Caso caso = new Caso();
                Usuario user = new Usuario();
                Direccion userAddres = new Direccion();
                Direccion eventAddres = new Direccion();
                counter++;
                caso.setFolio(Integer.parseInt(data[0]));
                caso.setFecha(Date.valueOf(data[1]));
                caso.setMes(Integer.parseInt(data[2]));
                caso.setAno(Integer.parseInt(data[3]));
                caso.setDia(Integer.parseInt(data[4]));
                user.setGenero(data[5]);
                user.setEdad(Integer.parseInt(data[6]));
                EstadoCivil ec = new EstadoCivil();
                ec.setDescripcion(data[7]);
                if(!estadoCivilRepository.existsByDescripcion(ec.getDescripcion())) {
                    ec = estadoCivilRepository.save(ec);
                }
                ec = estadoCivilRepository.findByDescripcion(data[7]);
                user.setEstadoCivil(ec);
                Ocupacion oc = new Ocupacion();
                oc.setDescripción(data[8]);
                if(!ocupacionRepository.existsByDescripción(oc.getDescripción())){
                    oc=ocupacionRepository.save(oc);
                }
                oc = ocupacionRepository.findByDescripción(oc.getDescripción());
                user.setOcupacionUsuario(oc);
                Escolaridad escolaridad = new Escolaridad();
                escolaridad.setDescripcion(data[9]);
                if(!escolaridadRepository.existsByDescripcion(escolaridad.getDescripcion())){
                    escolaridad=escolaridadRepository.save(escolaridad);
                }
                escolaridad=escolaridadRepository.findByDescripcion(escolaridad.getDescripcion());
                user.setEscolaridadUsuaria(escolaridad);
                userAddres.setEstado(data[10]);
                userAddres.setMunicipio(data[11]);
                userAddres.setColonia(data[12]);
                userAddres.setCp(data[13]);
                if(!direccionRepository.existsByEstadoAndColoniaAndMunicipioAndCp(userAddres.getEstado(),userAddres.getColonia(),userAddres.getMunicipio(),userAddres.getCp())){
                    userAddres = direccionRepository.save(userAddres);
                }
                userAddres = direccionRepository.findByEstadoAndColoniaAndMunicipioAndCp(userAddres.getEstado(), userAddres.getColonia(), userAddres.getMunicipio(), userAddres.getCp());
                user.setDireccionUsuario(userAddres);
                if(!data[14].equals("NA")&&!data[15].equals("NA")&&!data[16].equals("NA")) {
                    eventAddres.setEstado(data[14]);
                    eventAddres.setMunicipio(data[15]);
                    eventAddres.setColonia(data[16]);
                    eventAddres.setCp(data[17]);
                    if (!direccionRepository.existsByEstadoAndColoniaAndMunicipioAndCp(eventAddres.getEstado(), eventAddres.getColonia(), eventAddres.getMunicipio(),eventAddres.getCp())) {
                        eventAddres = direccionRepository.save(eventAddres);
                    }
                    eventAddres = direccionRepository.findByEstadoAndColoniaAndMunicipioAndCp(eventAddres.getEstado(),eventAddres.getColonia(),eventAddres.getMunicipio(),eventAddres.getCp());
                    caso.setDireccionHechos(eventAddres);
                }
                Origen origen = new Origen();
                origen.setDescripcion(data[18]);
                if (!origenRepository.existsByDescripcion(origen.getDescripcion())){
                    origen = origenRepository.save(origen);
                }
                origen = origenRepository.findByDescripcion(origen.getDescripcion());
                caso.setOrigen(origen);
                Servicio servicio = new Servicio();
                servicio.setDescripcion(data[19]);
                if(!servicioRepository.existsByDescripcion(servicio.getDescripcion())){
                    servicio = servicioRepository.save(servicio);
                }
                servicio = servicioRepository.findByDescripcion(servicio.getDescripcion());
                caso.setServicio(servicio);
                user=usuarioRepository.save(user);
                caso.setIdUsuario(user);
                caso = casoRepository.save(caso);
                for(int i = 20;i<27;i++){
                    if(!data[i].matches("NA")) {
                        Temas tema = new Temas();
                        tema.setDescripcion(data[i]);
                        if (!temaRepository.existsByDescripcion(tema.getDescripcion())) {
                            tema = temaRepository.save(tema);
                        }
                        tema = temaRepository.findByDescripcion(tema.getDescripcion());
                        TemasCasoId id = new TemasCasoId();
                        id.setIdCaso(caso);
                        id.setIdTema(tema);
                        if(!temasCasoRepository.existsById(id)){
                            TemasCaso temaCaso = new TemasCaso();
                            temaCaso.setIdCaso(caso);
                            temaCaso.setIdTema(tema);
                            temasCasoRepository.save(temaCaso);
                        }
                    }
                    }
                }
                counter++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @RequestMapping("/parsToStar")
    public String loadStarModel(){

        return "star model created";
    }
}
