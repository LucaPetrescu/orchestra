package com.prep.orchestra.api.data.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "tenants")
public class Tenant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String apiKeyHash;

    private Integer rateLimitPerSec;

    private Integer quotaPerDay;

    @CreationTimestamp
    private Instant createdAt;

}
