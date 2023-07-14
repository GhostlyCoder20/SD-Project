package com.ghostlycoder.syslab.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Data
@Table(name = "mantenimiento")
public class Maintenance {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mantenimiento")
    private Long id;
    @Column(name = "id_lab")
    private Long idLaboratory;
    @Column(name = "id_computadora")
    private Long idComputer;
    @Column(name = "tipo_limpieza")
    private String cleanType;
    @Column(name = "descripcion")
    private String description;
    @Column(name = "date")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date date;




}
