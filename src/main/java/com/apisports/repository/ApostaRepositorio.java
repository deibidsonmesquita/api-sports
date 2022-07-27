package com.apisports.repository;

import com.apisports.models.Aposta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApostaRepositorio extends JpaRepository<Aposta, Long> {
}
