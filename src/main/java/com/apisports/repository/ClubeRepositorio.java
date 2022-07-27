package com.apisports.repository;

import com.apisports.models.Clube;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClubeRepositorio extends JpaRepository<Clube, Integer> {
}
