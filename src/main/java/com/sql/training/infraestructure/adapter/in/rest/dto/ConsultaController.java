package com.sql.training.infraestructure.adapter.in.rest.dto;


import com.sql.training.application.port.in.CrearConsulta;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
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
    public ResponseEntity<?> create( @RequestBody Object object ){


        return ResponseEntity.status(HttpStatus.CREATED).body(null);
    }

}
