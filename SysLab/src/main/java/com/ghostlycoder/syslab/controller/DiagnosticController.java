package com.ghostlycoder.syslab.controller;


import com.ghostlycoder.syslab.entity.Diagnostic;
import com.ghostlycoder.syslab.service.DiagnosticService;

import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("api/diagnostico")
public class DiagnosticController {


    private DiagnosticService diagnosticService;



    @GetMapping
    ResponseEntity<List<Diagnostic>> searchAllDiagnosticsController(){
        List<Diagnostic> diagnostics = diagnosticService.searchAllDiagnostics();
        return new ResponseEntity<>(diagnostics, HttpStatus.OK);
    }

    @GetMapping("{id}")
    ResponseEntity<Diagnostic> searchDiagnosticByIdController(@PathVariable("id") Long id){
        Diagnostic diagnostic = diagnosticService.searchDiagnosticById(id);
        return new ResponseEntity<>(diagnostic, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Diagnostic> createDiagnosticController(@RequestBody Diagnostic input){
        Diagnostic diagnostic = diagnosticService.createDiagnostic(input);
        return new ResponseEntity<>(diagnostic, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Diagnostic> updateDiagnosticController(@PathVariable("id") Long id, @RequestBody Diagnostic input){
        Diagnostic diagnostic = diagnosticService.updateDiagnostic(input);
        return new ResponseEntity<>(diagnostic, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    ResponseEntity<Boolean> deleteDiagnosticController(@PathVariable("id") Long id){
        diagnosticService.deleteDiagnostic(id);
        return new ResponseEntity<>(Boolean.TRUE, HttpStatus.OK);
    }



}
