package com.sql.training.application.port.in;

import com.sql.training.domain.model.Consulta;
import com.sql.training.infraestructure.adapter.out.persistence.entity.ConsultaEntity;

public interface CrearConsulta {

    Consulta crear(Consulta consulta);
}
