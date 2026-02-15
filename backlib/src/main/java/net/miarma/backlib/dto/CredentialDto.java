package net.miarma.backlib.dto;

import java.time.Instant;
import java.util.UUID;

public class CredentialDto {
    private UUID credentialId;
    private UUID userId;
    private Byte serviceId;
    private String username;
    private String email;
    private Byte status;
    private Instant createdAt;
    private Instant updatedAt;

    public CredentialDto() {}

    public CredentialDto(UUID credentialId, UUID userId, Byte serviceId, String username, String email,
                         Byte status, Instant createdAt, Instant updatedAt) {
        this.credentialId = credentialId;
        this.userId = userId;
        this.serviceId = serviceId;
        this.username = username;
        this.email = email;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getters y setters
    public UUID getCredentialId() {
        return credentialId;
    }
    public void setCredentialId(UUID credentialId) {
        this.credentialId = credentialId;
    }
    public UUID getUserId() {
        return userId;
    }
    public void setUserId(UUID userId) {
        this.userId = userId;
    }
    public Byte getServiceId() {
        return serviceId;
    }
    public void setServiceId(Byte serviceId) {
        this.serviceId = serviceId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Byte getStatus() {
        return status;
    }
    public void setStatus(Byte status) {
        this.status = status;
    }
    public Instant getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
    public Instant getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }
}
