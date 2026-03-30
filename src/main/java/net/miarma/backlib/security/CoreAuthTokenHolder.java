package net.miarma.backlib.security;

import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class CoreAuthTokenHolder {
    private volatile String token;
    private volatile Instant expiresAt;

    public String getToken() {
        return token;
    }

    public boolean isExpired() {
        return expiresAt == null || Instant.now().isAfter(expiresAt.minusSeconds(30));
    }

    public void setToken(String token, Instant expiresAt) {
        this.token = token;
        this.expiresAt = expiresAt;
    }
}
