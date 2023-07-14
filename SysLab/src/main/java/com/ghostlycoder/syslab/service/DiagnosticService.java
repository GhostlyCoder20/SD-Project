package com.ghostlycoder.syslab.service;

import com.ghostlycoder.syslab.entity.Diagnostic;


import java.util.List;

public interface DiagnosticService {

    List<Diagnostic> searchAllDiagnostics();

    Diagnostic searchDiagnosticById(Long id);

    Diagnostic createDiagnostic(Diagnostic diagnostic);

    Diagnostic updateDiagnostic(Diagnostic diagnostic);
    void deleteDiagnostic(Long id);
}
