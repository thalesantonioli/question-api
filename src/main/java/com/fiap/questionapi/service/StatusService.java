package com.fiap.questionapi.service;

import com.fiap.questionapi.exception.NotFoundException;
import com.fiap.questionapi.model.entity.Status;

public interface StatusService {
    Status findById(Long id) throws NotFoundException;
}
