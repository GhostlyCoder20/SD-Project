package com.ghostlycoder.syslab.service;

import com.ghostlycoder.syslab.entity.Computer;
import com.ghostlycoder.syslab.entity.Laboratory;

import java.util.List;

public interface LaboratoryService {

    List<Laboratory> searchAllLaboratories();
    Laboratory searchLaboratoryById(Long id);
    Laboratory createLaboratory(Laboratory laboratory);
    Laboratory updateLaboratory(Laboratory laboratory);
    void deleteLaboratoryById(Long id);
}
