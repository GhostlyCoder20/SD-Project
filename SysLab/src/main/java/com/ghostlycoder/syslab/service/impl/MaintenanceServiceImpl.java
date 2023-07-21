package com.ghostlycoder.syslab.service.impl;

import com.ghostlycoder.syslab.entity.Computer;
import com.ghostlycoder.syslab.entity.Laboratory;
import com.ghostlycoder.syslab.entity.Maintenance;
import com.ghostlycoder.syslab.repository.ComputerRepository;
import com.ghostlycoder.syslab.repository.LaboratoryRepository;
import com.ghostlycoder.syslab.repository.MaintenanceRepository;
import com.ghostlycoder.syslab.service.MaintenanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MaintenanceServiceImpl implements MaintenanceService {


    private final MaintenanceRepository maintenanceRepository;
    private final LaboratoryRepository laboratoryRepository;
    private final ComputerRepository computerRepository;

    @Override
    public List<Maintenance> searchAllMaintenances() {
        return maintenanceRepository.findAll();
    }

    @Override
    public Maintenance searchMaintenanceById(Long id) {
        Optional<Maintenance> specificMaintenance = maintenanceRepository.findById(id);
        return specificMaintenance.orElseThrow();
    }

    @Override
    public Maintenance createMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance updateMaintenance(Maintenance maintenance) {
        Maintenance exist = maintenanceRepository.findById(maintenance.getId()).orElseThrow();
        exist.setCleanType(maintenance.getCleanType());
        exist.setDescription(maintenance.getDescription());
        exist.setDate(maintenance.getDate());
        return maintenanceRepository.save(exist);
    }

    @Override
    public void deleteMaintenance(Long id) {
        maintenanceRepository.deleteById(id);
    }
}
