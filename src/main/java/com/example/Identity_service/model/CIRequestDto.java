package com.example.Identity_service.model;

public class CIRequestDto {
    private String ci;

    public CIRequestDto() {}

    public CIRequestDto(String ci) {
        this.ci = ci;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }
}