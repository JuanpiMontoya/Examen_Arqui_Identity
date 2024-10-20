package com.example.Identity_service;


import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CIService {

    private List<String> ListaCIs = Arrays.asList("1234", "8765", "1111");

    public boolean ciExists(String ci) {
        return ListaCIs.contains(ci);
    }
}

