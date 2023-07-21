package com.ghostlycoder.syslab.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "laboratorio")
public class Laboratory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idlaboratorio")
    private Long id;
    @Column(name = "nombre")
    private String name;
    @Column(name = "descripcion")
    private String description;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "laboratory", cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Diagnostic> diagnostics;


}
