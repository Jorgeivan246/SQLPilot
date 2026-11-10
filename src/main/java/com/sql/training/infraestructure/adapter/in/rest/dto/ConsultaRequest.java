package com.sql.training.infraestructure.adapter.in.rest.dto;

import com.sql.training.infraestructure.adapter.out.persistence.entity.MotorBDEntity;
import com.sql.training.infraestructure.adapter.out.persistence.entity.TipoConsultaEntity;
import com.sql.training.infraestructure.adapter.out.persistence.entity.UsuarioEntity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ConsultaRequest {

    TipoConsultaEntity tipoConsulta;

    MotorBDEntity motorBD;


    List<UsuarioEntity> usuario;
}
