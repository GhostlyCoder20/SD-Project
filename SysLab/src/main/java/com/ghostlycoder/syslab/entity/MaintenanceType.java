package com.ghostlycoder.syslab.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tipo_mantenimiento")
public class MaintenanceType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipo_mantenimiento")
    private Long id;
    @Column(name = "nombre")
    private String name;


}
