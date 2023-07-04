package com.ghostlycoder.syslab.service;

import com.ghostlycoder.syslab.entity.Computer;

import java.util.List;

public interface ComputerService {

    List<Computer> searchAllComputers();
    Computer searchComputerById(Long id);
    Computer createComputer(Computer computer);
    Computer updateComputer(Computer computer);
    void deleteComputerById(Long id);
}
