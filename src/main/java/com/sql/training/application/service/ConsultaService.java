package com.sql.training.application.service;

import com.sql.training.application.port.in.CrearConsulta;
import com.sql.training.application.port.out.ConsultaRepositoryPort;
import com.sql.training.domain.model.Consulta;
import com.sql.training.infraestructure.adapter.out.persistence.entity.ConsultaEntity;
import org.springframework.stereotype.Service;

@Service
public class ConsultaService implements CrearConsulta {

    private final ConsultaRepositoryPort consultaRepositoryPort;

    public ConsultaService(ConsultaRepositoryPort consultaRepositoryPort) {
        this.consultaRepositoryPort = consultaRepositoryPort;
    }


    @Override
    public Consulta crear(Consulta consulta) {
        return consultaRepositoryPort.guardar(consulta);
    }
}
