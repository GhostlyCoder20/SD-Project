package com.ghostlycoder.syslab.controller;

import com.ghostlycoder.syslab.entity.Laboratory;
import com.ghostlycoder.syslab.entity.MaintenanceType;
import com.ghostlycoder.syslab.service.MaintenanceTypeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("api/tipomantenimiento")
public class MaintenanceTypeController {

    private MaintenanceTypeService maintenanceTypeService;

    @GetMapping
    public ResponseEntity<List<MaintenanceType>> searchAllMaintenanceTypesController(){
        List<MaintenanceType> maintenanceTypes = maintenanceTypeService.searchAllMaintenanceTypes();
        return new ResponseEntity<>(maintenanceTypes, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<MaintenanceType> searchMaintenanceTypeByIdController(@PathVariable("id") Long id) {
        MaintenanceType maintenanceType = maintenanceTypeService.searchMaintenanceTypeById(id);
        return new ResponseEntity<>(maintenanceType, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<MaintenanceType> createMaintenanceTypeController(@RequestBody MaintenanceType input) {
        MaintenanceType maintenanceType = maintenanceTypeService.createMaintenanceType(input);
        return new ResponseEntity<>(maintenanceType,HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<MaintenanceType> updateMaintenanceTypeController(@PathVariable("id") Long id, @RequestBody MaintenanceType input) {
        MaintenanceType maintenanceType = maintenanceTypeService.updateMaintenanceType(input);
        return new ResponseEntity<>(maintenanceType,HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Boolean> deleteMaintenanceTypeController(@PathVariable("id") Long id) {
        maintenanceTypeService.deleteMaintenanceTypeById(id);
        return new ResponseEntity<>(Boolean.TRUE,HttpStatus.OK);

    }


}
