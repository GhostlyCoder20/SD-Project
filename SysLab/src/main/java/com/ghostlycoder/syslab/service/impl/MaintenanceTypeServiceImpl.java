package com.ghostlycoder.syslab.service.impl;

import com.ghostlycoder.syslab.entity.MaintenanceType;
import com.ghostlycoder.syslab.repository.MaintenanceTypeRepository;
import com.ghostlycoder.syslab.service.MaintenanceTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MaintenanceTypeServiceImpl implements MaintenanceTypeService {

    private final MaintenanceTypeRepository maintenanceTypeRepository;
    @Override
    public List<MaintenanceType> searchAllMaintenanceTypes() {
        return maintenanceTypeRepository.findAll();
    }

    @Override
    public MaintenanceType searchMaintenanceTypeById(Long id) {
        Optional<MaintenanceType> specificMaintenanceType = maintenanceTypeRepository.findById(id);
        return specificMaintenanceType.orElseThrow();
    }

    @Override
    public MaintenanceType createMaintenanceType(MaintenanceType maintenanceType) {
        return maintenanceTypeRepository.save(maintenanceType);
    }

    @Override
    public MaintenanceType updateMaintenanceType(MaintenanceType maintenanceType) {
        MaintenanceType exist = maintenanceTypeRepository.findById(maintenanceType.getId()).orElseThrow();
        exist.setName(maintenanceType.getName());
        return maintenanceTypeRepository.save(exist);
    }

    @Override
    public void deleteMaintenanceTypeById(Long id) {
        maintenanceTypeRepository.deleteById(id);
    }
}
