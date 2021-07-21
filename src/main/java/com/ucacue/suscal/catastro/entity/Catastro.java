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

    @Column(name = "nombre", nullable = false, length = 1000)
    private String nombre;

    @Column(name = "latitud", nullable = false, length = 50)
    private String latitud;

    @Column(name = "longitud", nullable = false, length = 50)
    private String longitud;

    @Column(name = "impuesto", nullable = false)
    private double impuesto;



}
