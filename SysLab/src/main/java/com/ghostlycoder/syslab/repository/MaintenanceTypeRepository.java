package com.ghostlycoder.syslab.repository;

import com.ghostlycoder.syslab.entity.MaintenanceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaintenanceTypeRepository extends JpaRepository<MaintenanceType, Long> {
}
