package com.sql.training.infraestructure.adapter.out.persistence;

import com.sql.training.infraestructure.adapter.out.persistence.entity.ConsultaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataConsultaRepository extends JpaRepository<ConsultaEntity,Long> {
}
