package com.sql.training.infraestructure.adapter.out.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OutputEntity {
    @Id
    private Long id;

    StringBuilder obtenido;





}
