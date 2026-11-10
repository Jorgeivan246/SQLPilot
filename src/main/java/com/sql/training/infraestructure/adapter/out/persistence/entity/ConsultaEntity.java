package com.sql.training.infraestructure.adapter.out.persistence.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
@Builder
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
