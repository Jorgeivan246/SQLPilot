package com.sql.training.infraestructure.adapter.out.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class UsuarioEntity extends PersonaEntity {

    private String profesion;


    @ManyToMany
    @JoinTable(
            name="usuario_consultas"
    )
    List<ConsultaEntity> consultaEntities;
}
