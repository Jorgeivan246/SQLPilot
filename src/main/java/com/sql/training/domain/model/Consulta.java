package com.sql.training.domain.model;

import com.sql.training.infraestructure.adapter.out.persistence.entity.MotorBDEntity;
import com.sql.training.infraestructure.adapter.out.persistence.entity.TipoConsultaEntity;
import com.sql.training.infraestructure.adapter.out.persistence.entity.UsuarioEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Consulta {



    private Long id;


    TipoConsultaEntity tipoConsulta;


    MotorBDEntity motorBDEntity;


    List<UsuarioEntity> usuarioEntities;
}
