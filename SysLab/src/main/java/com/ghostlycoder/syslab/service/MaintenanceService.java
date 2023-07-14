package com.ghostlycoder.syslab.service;

import com.ghostlycoder.syslab.entity.Maintenance;


import java.util.List;

public interface MaintenanceService {

    List<Maintenance> searchAllMaintenances();
    Maintenance searchMaintenanceById(Long id);
    Maintenance createMaintenance(Maintenance maintenance);
    Maintenance updateMaintenance(Maintenance maintenance);
    void deleteMaintenance(Long id);

}
