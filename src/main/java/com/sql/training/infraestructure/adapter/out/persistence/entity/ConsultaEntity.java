package com.sql.training.infraestructure.adapter.out.persistence.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
public class ConsultaEntity {


    @Id
    private Long id;

    @Enumerated(EnumType.ORDINAL)
    TipoConsultaEntity tipoConsulta;

    @Enumerated(EnumType.ORDINAL)
    MotorBDEntity motorBDEntity;

    @ManyToMany(mappedBy = "consultaEntities")
    List<UsuarioEntity> usuarioEntities;


}
