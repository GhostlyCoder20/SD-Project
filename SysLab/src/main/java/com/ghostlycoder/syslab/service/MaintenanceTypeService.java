package com.ghostlycoder.syslab.service;

import com.ghostlycoder.syslab.entity.Laboratory;
import com.ghostlycoder.syslab.entity.MaintenanceType;

import java.util.List;

public interface MaintenanceTypeService  {

    List<MaintenanceType> searchAllMaintenanceTypes();
    MaintenanceType searchMaintenanceTypeById(Long id);
    MaintenanceType createMaintenanceType(MaintenanceType maintenanceType);
    MaintenanceType updateMaintenanceType(MaintenanceType maintenanceType);
    void deleteMaintenanceTypeById(Long id);


}
