package com.ghostlycoder.syslab.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "diagnosis")
public class Diagnostic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_diagnosis")
    private Long id;
    @ManyToOne( fetch = FetchType.EAGER, targetEntity = Laboratory.class)
    @JoinColumn(name = "id_lab",nullable = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Laboratory laboratory;
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
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date date;








}
