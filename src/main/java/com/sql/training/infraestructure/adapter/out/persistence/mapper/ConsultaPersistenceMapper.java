package com.sql.training.infraestructure.adapter.out.persistence.mapper;


import com.sql.training.domain.model.Consulta;
import com.sql.training.infraestructure.adapter.out.persistence.entity.ConsultaEntity;
import org.springframework.stereotype.Component;

@Component
public class ConsultaPersistenceMapper {

    public Consulta toDomain(ConsultaEntity consultaEntity){

        if(consultaEntity ==null) return null;

        return Consulta.builder()
                .tipoConsulta(consultaEntity.getTipoConsulta())
                .motorBD(consultaEntity.getMotorBDEntity())
                .usuarios(consultaEntity.getUsuarioEntities())
                .build();

    }

    public ConsultaEntity toEntity(Consulta consulta){

        if(consulta == null) return null;
        return ConsultaEntity.builder()
                .motorBDEntity(consulta.getMotorBD())
                .tipoConsulta(consulta.getTipoConsulta())
                .usuarioEntities(consulta.getUsuarios())
                .build();
    }
}
