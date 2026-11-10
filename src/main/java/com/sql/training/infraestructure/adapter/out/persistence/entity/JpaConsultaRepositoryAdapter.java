package com.sql.training.infraestructure.adapter.out.persistence.entity;

import com.sql.training.application.port.out.ConsultaRepositoryPort;
import com.sql.training.infraestructure.adapter.out.persistence.SpringDataConsultaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor

public class JpaConsultaRepositoryAdapter implements ConsultaRepositoryPort {

   private final SpringDataConsultaRepository springDataConsultaRepository;

    @Override
    public ConsultaEntity guardar(ConsultaEntity consultaEntity) {
        return null;
    }
}
