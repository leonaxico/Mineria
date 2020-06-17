package com.axel.MineriaFinal.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class CasoStar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (referencedColumnName = "id")
    private UsuarioStar usuaria;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (referencedColumnName = "id")
    private Direccion direccionHechos;
    @JoinColumn (referencedColumnName = "id")
    private Direccion direccionUsuaria;
    @Column
    private Integer folio;
    @Column
    private Integer mes;
    @Column
    private Integer ano;
    @Column
    private Integer dia;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private Origen origen;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private Servicio servicio;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private Temas tema1;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private Temas tema2;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private Temas tema3;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private Temas tema4;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private Temas tema5;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private Temas tema6;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private Temas tema7;
}
