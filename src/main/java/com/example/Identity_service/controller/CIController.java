package com.example.Identity_service.controller;

import com.example.Identity_service.CIService;
import com.example.Identity_service.api.CIApi;
import com.example.Identity_service.model.CIRequestDto;
import com.example.Identity_service.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CIController implements CIApi {

    private final CIService ciService;

    public CIController(CIService ciService) {
        this.ciService = ciService;
    }

    @Override
    public ResponseEntity<Boolean> verificarCI(CIRequestDto ciRequestDto) {
        String ci = ciRequestDto.getCi();
        boolean exists = ciService.ciExists(ci);
        if (exists) {
            return ResponseEntity.ok(true);
        } else {
            // Devolver un ErrorResponse en lugar de un String
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(false);
        }
    }
}