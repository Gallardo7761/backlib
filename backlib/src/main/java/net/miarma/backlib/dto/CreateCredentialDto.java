package net.miarma.backlib.dto;

import java.time.Instant;
import java.util.UUID;

public class CreateCredentialDto {
    private UUID userId;
    private Byte serviceId;
    private String username;
    private String email;
    private String password;
    private Byte status;

    public CreateCredentialDto() {}

    public CreateCredentialDto(UUID userId, Byte serviceId, String username, String email,
                         String password, Byte status) {
        this.userId = userId;
        this.serviceId = serviceId;
        this.username = username;
        this.email = email;
        this.password = password;
        this.status = status;
    }

    // Getters y setters
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
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public Byte getStatus() {
        return status;
    }
    public void setStatus(Byte status) {
        this.status = status;
    }
}
