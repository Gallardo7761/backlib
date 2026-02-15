package net.miarma.backlib.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record LoginResponse(@JsonProperty("token") String token,
							UserDto user,
							CredentialDto account) {}