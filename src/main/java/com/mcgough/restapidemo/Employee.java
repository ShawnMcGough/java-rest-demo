package com.mcgough.restapidemo;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record Employee(@Min(0) int id, @NotBlank String name, String role) { }

