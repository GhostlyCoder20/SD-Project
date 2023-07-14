package com.ghostlycoder.syslab.controller;


import com.ghostlycoder.syslab.entity.Laboratory;
import com.ghostlycoder.syslab.service.LaboratoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/laboratorio")
@CrossOrigin(origins = "http://localhost:4200/")
public class LaboratoryController {

    private LaboratoryService laboratoryService;

    @GetMapping
    ResponseEntity<List<Laboratory>> searchAllLaboratoriesController() {
        List<Laboratory> laboratories = laboratoryService.searchAllLaboratories();
        return new ResponseEntity<>(laboratories, HttpStatus.OK);
    }

    @GetMapping("{id}")
    ResponseEntity<Laboratory> searchLaboratoryByIdController(@PathVariable("id") Long id) {
        Laboratory laboratory = laboratoryService.searchLaboratoryById(id);
        return new ResponseEntity<>(laboratory,HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<Laboratory> createLaboratoryController (@RequestBody Laboratory input) {
        Laboratory laboratory = laboratoryService.createLaboratory(input);
        return new ResponseEntity<>(laboratory,HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<Laboratory> updateLaboratoryController(@PathVariable("id") Long id,@RequestBody Laboratory input) {
        Laboratory laboratory = laboratoryService.updateLaboratory(input);
        return new ResponseEntity<>(laboratory,HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Boolean> deleteLaboratoryController(@PathVariable("id") Long id) {
        laboratoryService.deleteLaboratoryById(id);
        return new ResponseEntity<>(Boolean.TRUE,HttpStatus.OK);

    }





}
