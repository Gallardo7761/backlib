package net.miarma.backlib.dto;

import java.time.Instant;
import java.util.UUID;

public class UserDto {
    private UUID userId;
    private String displayName;
    private String avatar;
    private Byte globalStatus;
    private Byte globalRole;
    private Instant createdAt;
    private Instant updatedAt;

    public UserDto() {}

    public UserDto(UUID userId, String displayName, String avatar, Byte globalStatus, Byte globalRole,
                   Instant createdAt, Instant updatedAt) {
        this.userId = userId;
        this.displayName = displayName;
        this.avatar = avatar;
        this.globalStatus = globalStatus;
        this.globalRole = globalRole;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getters y setters
    public UUID getUserId() {
        return userId;
    }
    public void setUserId(UUID userId) {
        this.userId = userId;
    }
    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    public String getAvatar() {
        return avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public Byte getGlobalStatus() {
        return globalStatus;
    }
    public void setGlobalStatus(Byte globalStatus) {
        this.globalStatus = globalStatus;
    }
    public Byte getGlobalRole() {
        return globalRole;
    }
    public void setGlobalRole(Byte globalRole) {
        this.globalRole = globalRole;
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
