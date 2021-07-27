package com.ucacue.suscal.catastro.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
public class Catastro {

    @Id
    private String clave;

    @Column
    private String cedula;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private String observacion;

    @Column
    private String latitud;

    @Column
    private String longuitud;

    @Column
    private Float impuesto;

    @Column
    private Float bomberos;

    @Column
    private Float avaluo;

    @Column
    private Integer administrativos;


}
