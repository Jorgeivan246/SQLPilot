package com.sql.training.application.port.out;

import com.sql.training.domain.model.Consulta;
import com.sql.training.infraestructure.adapter.out.persistence.entity.ConsultaEntity;

public interface ConsultaRepositoryPort {

    Consulta guardar(Consulta consulta);
}
