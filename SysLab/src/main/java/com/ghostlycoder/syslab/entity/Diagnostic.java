package com.ghostlycoder.syslab.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Entity
@Data
@Table(name = "diagnosis")
public class Diagnostic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_diagnosis")
    private Long id;
    @Column(name = "id_lab")
    private Long idLaboratory;
    @Column(name = "service_tag")
    private String serviceTag;
    @Column(name = "descripcion")
    private String description;
    @Column(name = "imagen1")
    private String image1;
    @Column(name = "imagen2")
    private String image2;
    @Column(name = "imagen3")
    private String image3;
    @Column(name = "fecha")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date date;








}
