package com.axel.MineriaFinal.Entity;

import javax.persistence.*;

public class UsuarioStar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Integer edad;
    @Column
    private String genero;
    @Column
    private String estadoCivil;
    @Column
    private String ocupacionUsuario;
    @Column
    private String escolaridadUsuario;

}
