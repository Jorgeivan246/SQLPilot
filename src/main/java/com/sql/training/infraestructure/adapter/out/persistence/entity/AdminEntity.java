package com.sql.training.infraestructure.adapter.out.persistence.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
@Entity
public class AdminEntity extends PersonaEntity {
    @Id
    private Long id;
}
