package com.ghostlycoder.syslab.entity;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name = "computadora")
public class Computer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcomputadora")
    private Long id;
    @Column(name = "nombre")
    private String name;
    @Column(name = "descripcion")
    private String description;
    @Column(name = "marca")
    private String brand;
    @Column(name = "modelo")
    private String model;
    @Column(name = "procesador")
    private String processor;
    @Column(name = "ram")
    private int ram;
    @Column(name = "almacenamiento")
    private double storage;
    @Column(name = "service_tag")
    private String serviceTag;
    @Column(name = "no_inventario")
    private String noInventory;
    @Column(name = "ubicacion")
    private int location;


}
