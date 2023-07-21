package com.ghostlycoder.syslab.controller;

import com.ghostlycoder.syslab.entity.Laboratory;
import com.ghostlycoder.syslab.entity.Maintenance;
import com.ghostlycoder.syslab.service.MaintenanceService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("api/mantenimiento")
public class MaintenanceController {

    private MaintenanceService maintenanceService;


    @GetMapping
    ResponseEntity<List<Maintenance>> searchAllMaintenancesController() {
        List<Maintenance> maintenances = maintenanceService.searchAllMaintenances();
        return new ResponseEntity<>(maintenances, HttpStatus.OK);
    }

    @GetMapping("{id}")
    ResponseEntity<Maintenance> searchMaintenanceByIdController(@PathVariable("id") Long id) {
        Maintenance maintenance = maintenanceService.searchMaintenanceById(id);
        return new ResponseEntity<>(maintenance, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Maintenance> createMaintenanceController(@RequestBody Maintenance input) {
        Maintenance maintenance = maintenanceService.createMaintenance(input);
                 return new ResponseEntity<>(maintenance,HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<Maintenance> updateMaintenanceController(@PathVariable("id") Long id,@RequestBody Maintenance input) {
        Maintenance maintenance = maintenanceService.updateMaintenance(input);
        return new ResponseEntity<>(maintenance,HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Boolean> deleteMaintenanceController(@PathVariable("id") Long id) {
        maintenanceService.deleteMaintenance(id);
        return new ResponseEntity<>(Boolean.TRUE,HttpStatus.OK);

    }







}
