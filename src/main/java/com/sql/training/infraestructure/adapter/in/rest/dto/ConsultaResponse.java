package com.sql.training.infraestructure.adapter.in.rest.dto;

import com.sql.training.domain.model.Consulta;
import com.sql.training.infraestructure.adapter.out.persistence.entity.MotorBDEntity;
import com.sql.training.infraestructure.adapter.out.persistence.entity.TipoConsultaEntity;
import com.sql.training.infraestructure.adapter.out.persistence.entity.UsuarioEntity;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class ConsultaResponse {


    private TipoConsultaEntity tipoConsulta;

    private MotorBDEntity motorBD;


    private List<UsuarioEntity> usuario;


    public static ConsultaResponse from(Consulta consulta ){


        return ConsultaResponse.builder()
                .tipoConsulta(consulta.getTipoConsulta())
                .motorBD(consulta.getMotorBD())
                .usuario(consulta.getUsuarios())
                .build();
    }
}
