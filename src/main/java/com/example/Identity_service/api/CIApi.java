package com.example.Identity_service.api;

import com.example.Identity_service.model.CIRequestDto;
import com.example.Identity_service.model.ErrorResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Identidad", description = "API para gestionar la verificación de CI")
@RestController
@RequestMapping("/api/identidad")
public interface CIApi {

    @Operation(summary = "Verificar existencia de CI",
            description = "Verifica si un CI existe en la lista.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "CI existe",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = Boolean.class))),
            @ApiResponse(responseCode = "404", description = "CI no encontrado",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)))
    })
    @PostMapping("/verificar")
    ResponseEntity<Boolean> verificarCI(@RequestBody CIRequestDto ciRequestDto);
}