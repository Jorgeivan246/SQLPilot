package com.sql.training.infraestructure.adapter.in.rest;


import com.sql.training.application.port.in.CrearConsulta;
import com.sql.training.domain.model.Consulta;
import com.sql.training.infraestructure.adapter.in.rest.dto.ConsultaRequest;
import com.sql.training.infraestructure.adapter.in.rest.dto.ConsultaResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/consulta")
@RequiredArgsConstructor
public class ConsultaController {

    private final CrearConsulta CrearConsulta;


    @PostMapping
    public ResponseEntity<?> create(@RequestBody ConsultaRequest consultaRequest){

        Consulta consulta = Consulta.builder()
                .tipoConsulta(consultaRequest.getTipoConsulta())
                .motorBD(consultaRequest.getMotorBD())
                .usuarios(consultaRequest.getUsuario())
                .build();

        Consulta saved =  CrearConsulta.crear(consulta);

        return ResponseEntity.status(HttpStatus.CREATED).body(ConsultaResponse.from(saved));
    }

}
