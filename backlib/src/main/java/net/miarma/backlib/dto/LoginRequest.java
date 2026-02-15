package net.miarma.backlib.dto;

import jakarta.validation.constraints.NotBlank;
import tools.jackson.databind.JsonNode;

public record LoginRequest(@NotBlank String username,
						   @NotBlank String password,
						   Byte serviceId) {}
