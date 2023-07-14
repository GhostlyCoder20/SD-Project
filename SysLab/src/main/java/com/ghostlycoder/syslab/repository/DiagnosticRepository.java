package com.ghostlycoder.syslab.repository;

import com.ghostlycoder.syslab.entity.Diagnostic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiagnosticRepository extends JpaRepository<Diagnostic,Long> {
}
