package com.sql.training.domain.model;

import com.sql.training.infraestructure.adapter.out.persistence.entity.ConsultaEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Usuario extends Admin{


    private String profesion;

    List<ConsultaEntity> consultaEntities;
}
