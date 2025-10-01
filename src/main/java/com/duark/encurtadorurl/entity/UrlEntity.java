package com.duark.encurtadorurl.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "urls")
@Getter
@Setter
public class UrlEntity {

    @Id
    private String id;

    private String fullUrl;

    private LocalDateTime expiresAt;

    public UrlEntity() {
    }
    public UrlEntity(String id, String fullUrl, LocalDateTime expiresAt) {
        this.id = id;
        this.fullUrl = fullUrl;
        this.expiresAt = expiresAt;
    }

}
