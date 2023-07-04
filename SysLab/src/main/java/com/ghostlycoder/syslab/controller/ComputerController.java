package com.ghostlycoder.syslab.controller;


import com.ghostlycoder.syslab.entity.Computer;
import com.ghostlycoder.syslab.service.ComputerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/computadora")
public class ComputerController {

    private ComputerService computerService;

    @GetMapping
    public ResponseEntity<List<Computer>> searchAllComputersController() {
        List<Computer> computers = computerService.searchAllComputers();
        return new ResponseEntity<>(computers, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Computer> searchComputerByIdController(@PathVariable("id") Long id) {
        Computer computer = computerService.searchComputerById(id);
        return new ResponseEntity<>(computer,HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<Computer> createComputerController(@RequestBody Computer input) {
        Computer computer = computerService.createComputer(input);
        return new ResponseEntity<>(computer,HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<Computer> updateComputerController(@PathVariable("id") Long id, @RequestBody Computer input ){
        Computer computer = computerService.updateComputer(input);
        return new ResponseEntity<>(computer, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteComputerController(@PathVariable("id") Long id) {
        computerService.deleteComputerById(id);
        return new ResponseEntity<>("La computadora ha sido eliminada correctamente", HttpStatus.OK );
    }


}
