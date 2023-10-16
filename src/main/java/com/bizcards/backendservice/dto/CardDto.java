package com.bizcards.backendservice.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Date;

@Data
public class CardDto {

    @NotBlank
    private String title;

    @NotBlank
    private String company;

    @NotBlank
    private String industry;

    private String description;

    private String tag;

    private String visibility;

    private String creationDate;

    private String lastUpdatedDate;

    private Long userId;


}
