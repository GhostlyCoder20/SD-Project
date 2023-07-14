package com.ghostlycoder.syslab.service.impl;

import com.ghostlycoder.syslab.entity.Diagnostic;
import com.ghostlycoder.syslab.repository.DiagnosticRepository;
import com.ghostlycoder.syslab.service.DiagnosticService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DiagnosticServiceImpl implements DiagnosticService {

    private final DiagnosticRepository diagnosticRepository;

    @Override
    public List<Diagnostic> searchAllDiagnostics() {
        return diagnosticRepository.findAll();
    }

    @Override
    public Diagnostic searchDiagnosticById(Long id) {
        Optional<Diagnostic> specificDiagnostic = diagnosticRepository.findById(id);
        return specificDiagnostic.orElseThrow();
    }

    @Override
    public Diagnostic createDiagnostic(Diagnostic diagnostic) {
        return diagnosticRepository.save(diagnostic);
    }

    @Override
    public Diagnostic updateDiagnostic(Diagnostic diagnostic) {
        Diagnostic exist = diagnosticRepository.findById(diagnostic.getId()).orElseThrow();
        exist.setIdLaboratory(diagnostic.getIdLaboratory());
        exist.setServiceTag(diagnostic.getServiceTag());
        exist.setDescription(diagnostic.getDescription());
        exist.setImage1(diagnostic.getImage1());
        exist.setImage2(diagnostic.getImage2());
        exist.setImage3(diagnostic.getImage3());
        exist.setDate(diagnostic.getDate());
        return diagnosticRepository.save(exist);
    }

    @Override
    public void deleteDiagnostic(Long id) {
        diagnosticRepository.deleteById(id);

    }
}
