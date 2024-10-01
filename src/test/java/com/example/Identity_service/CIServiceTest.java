package com.example.Identity_service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CIServiceTest {

    @Test
    void ciExists() {
        // Arrange
        CIService ciService = new CIService();
        String ciExistente = "1234";

        // Act
        boolean resultado = ciService.ciExists(ciExistente);

        // Assert
        assertTrue(resultado, "El CI debería existir.");
    }

    @Test
    void ciNotExists() {
        // Arrange
        CIService ciService = new CIService();
        String ciNoExistente = "9999";

        // Act
        boolean resultado = ciService.ciExists(ciNoExistente);

        // Assert
        assertFalse(resultado, "El CI no debería existir.");
    }
}