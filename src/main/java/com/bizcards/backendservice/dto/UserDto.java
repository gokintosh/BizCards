package com.bizcards.backendservice.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class UserDto {

    @NotEmpty(message = "username cannot be blank!!")
    @Size(min = 5,max = 20,message = "username should have at-least 5 characters!")
    private String username;

    @Email
    @NotEmpty
    private String email;

    @NotEmpty
    @Size(min = 8,max = 20,message = "password should have at-least 8 characters!!")
    @Pattern.List({
            @Pattern(regexp = ".*\\d.*",message = "Password must contain at least 1 digit!"),
            @Pattern(regexp = ".*[a-z].*",message = "Password must contain at least one lowercase letter!"),
            @Pattern(regexp = ".*[A-Z].*",message = "Password must contain at least one uppercase letter!"),
            @Pattern(regexp = ".*[!@#$%^&*()].*",message = "Password must contain at least one special character!")
    })
    private String password;

    private String profilePicture;

    @NotBlank
    private String description;
}
