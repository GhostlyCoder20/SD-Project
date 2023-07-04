package com.ghostlycoder.syslab.repository;

import com.ghostlycoder.syslab.entity.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepository extends JpaRepository<Computer,Long> {
}
