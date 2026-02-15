package net.miarma.backlib.dto;

import jakarta.validation.constraints.NotBlank;

public record RegisterRequest(String displayName,
							  @NotBlank String username,
							  @NotBlank String email,
							  @NotBlank String password,
							  Byte serviceId) {}