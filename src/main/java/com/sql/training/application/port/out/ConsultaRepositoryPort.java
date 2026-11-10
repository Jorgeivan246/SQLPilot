package com.sql.training.application.port.out;

import com.sql.training.infraestructure.adapter.out.persistence.entity.ConsultaEntity;

public interface ConsultaRepositoryPort {

    ConsultaEntity guardar(ConsultaEntity consultaEntity);
}
