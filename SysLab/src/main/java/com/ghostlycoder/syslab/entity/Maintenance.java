package com.ghostlycoder.syslab.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
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
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Computer.class)
    @JoinColumn(name = "id_computadora",nullable = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Computer computer;
    @Column(name = "tipo_limpieza")
    private String cleanType;
    @Column(name = "descripcion")
    private String description;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date date;




}
