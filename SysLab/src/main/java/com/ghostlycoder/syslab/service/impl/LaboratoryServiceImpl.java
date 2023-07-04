package com.ghostlycoder.syslab.service.impl;

import com.ghostlycoder.syslab.entity.Laboratory;
import com.ghostlycoder.syslab.repository.LaboratoryRepository;
import com.ghostlycoder.syslab.service.LaboratoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LaboratoryServiceImpl implements LaboratoryService {

    private final LaboratoryRepository laboratoryRepository;
    @Override
    public List<Laboratory> searchAllLaboratories() {
        return laboratoryRepository.findAll();
    }

    @Override
    public Laboratory searchLaboratoryById(Long id) {
        Optional<Laboratory> specificLaboratory = laboratoryRepository.findById(id);
        return specificLaboratory.get();
    }

    @Override
    public Laboratory createLaboratory(Laboratory laboratory) {
        return laboratoryRepository.save(laboratory);
    }

    @Override
    public Laboratory updateLaboratory(Laboratory laboratory) {
        Laboratory exist = laboratoryRepository.findById(laboratory.getId()).get();
        exist.setName(laboratory.getName());
        exist.setDescription(laboratory.getDescription());
        return laboratoryRepository.save(exist);
    }

    @Override
    public void deleteLaboratoryById(Long id) {
        laboratoryRepository.deleteById(id);
    }
}
