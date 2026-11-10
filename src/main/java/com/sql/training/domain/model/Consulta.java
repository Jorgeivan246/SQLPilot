package com.sql.training.domain.model;

import com.sql.training.infraestructure.adapter.out.persistence.entity.MotorBDEntity;
import com.sql.training.infraestructure.adapter.out.persistence.entity.TipoConsultaEntity;
import com.sql.training.infraestructure.adapter.out.persistence.entity.UsuarioEntity;
import lombok.*;

import java.util.List;


@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Consulta {






    TipoConsultaEntity tipoConsulta;


    MotorBDEntity motorBD;


    List<UsuarioEntity> usuarios;
}
