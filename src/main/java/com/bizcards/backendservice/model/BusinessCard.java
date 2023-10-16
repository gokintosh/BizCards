package com.bizcards.backendservice.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
public class BusinessCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String title;

    @NotBlank
    private String company;

    private String industry;

    @NotBlank
    private String description;

    private String tag;

    private String visibility;

    private String creationDate;

    private String lastUpdateDate;

    @Column(name = "user_id")
    private Long userId;



}
