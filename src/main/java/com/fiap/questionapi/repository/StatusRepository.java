package com.fiap.questionapi.repository;

import com.fiap.questionapi.model.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
