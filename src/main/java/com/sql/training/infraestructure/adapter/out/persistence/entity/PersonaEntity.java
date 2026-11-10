package com.sql.training.infraestructure.adapter.out.persistence.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity
public class PersonaEntity {

    @Id
    private Long id;

    private String nombre;

    private String correo;

    private String password;



}
