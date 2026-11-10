package com.sql.training.infraestructure.adapter.out.persistence;

import com.sql.training.application.port.out.ConsultaRepositoryPort;
import com.sql.training.domain.model.Consulta;
import com.sql.training.infraestructure.adapter.out.persistence.entity.ConsultaEntity;
import com.sql.training.infraestructure.adapter.out.persistence.mapper.ConsultaPersistenceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public class JpaConsultaRepositoryAdapter implements ConsultaRepositoryPort {


    private final ConsultaPersistenceMapper mapper;
    private final SpringDataConsultaRepository springDataConsultaRepository;

    @Override
    public Consulta guardar(Consulta consulta) {

       ConsultaEntity entity= mapper.toEntity(consulta);

       ConsultaEntity saved=  springDataConsultaRepository.save(entity);

        return mapper.toDomain(saved);
    }
}
