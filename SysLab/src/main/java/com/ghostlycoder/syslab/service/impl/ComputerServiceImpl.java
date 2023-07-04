package com.ghostlycoder.syslab.service.impl;


import com.ghostlycoder.syslab.entity.Computer;
import com.ghostlycoder.syslab.repository.ComputerRepository;
import com.ghostlycoder.syslab.service.ComputerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ComputerServiceImpl implements ComputerService {

    private final ComputerRepository computerIRepository;


    @Override
    public List<Computer> searchAllComputers() {
        return computerIRepository.findAll();
    }

    @Override
    public Computer searchComputerById(Long id) {
        Optional<Computer> specificComputer = computerIRepository.findById(id);
        return specificComputer.get();
    }

    @Override
    public Computer createComputer(Computer computer) {
        return computerIRepository.save(computer);
    }

    @Override
    public Computer updateComputer(Computer computer) {
        Computer exist = computerIRepository.findById(computer.getId()).get();
        exist.setName(computer.getName());
        exist.setDescription(computer.getDescription());
        exist.setBrand(computer.getBrand());
        exist.setModel(computer.getModel());
        exist.setRam(computer.getRam());
        exist.setStorage(computer.getStorage());
        exist.setServiceTag(computer.getServiceTag());
        exist.setNoInventory(computer.getNoInventory());
        exist.setLocation(computer.getLocation());
        return computerIRepository.save(exist);

    }

    @Override
    public void deleteComputerById(Long id) {

        computerIRepository.deleteById(id);

    }
}
