package com.ghostlycoder.syslab.repository;

import com.ghostlycoder.syslab.entity.Laboratory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaboratoryRepository extends JpaRepository<Laboratory,Long> {
}
