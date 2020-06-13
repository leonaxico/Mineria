package com.axel.MineriaFinal.Utils;

import com.axel.MineriaFinal.Entity.Caso;
import com.axel.MineriaFinal.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
    public static  void red(String fileName, String splitter){
        BufferedReader br = null;
        String line = "";
        try {
            br = new BufferedReader(new FileReader(fileName));
            int counter=0;
            while ((line = br.readLine()) != null) {
                if (counter == 0){
                    System.out.println(line);
                }
                String[] data = line.split(splitter);
                Caso caso = new Caso();
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
}
