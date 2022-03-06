package com.fiap.questionapi.service.impl;

import com.fiap.questionapi.exception.NotFoundException;
import com.fiap.questionapi.model.entity.Status;
import com.fiap.questionapi.repository.StatusRepository;
import com.fiap.questionapi.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusServiceImpl implements StatusService {

    @Autowired
    private StatusRepository statusRepository;

    @Override
    public Status findById(Long id) throws NotFoundException {
        return statusRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Status não encontrado."));
    }
}
