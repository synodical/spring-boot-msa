package com.example.userservice.vo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RequestLogin {
    @NotNull(message = "Email cannot be null")
    @Size(min = 2, message = "Email not be less than 2char")
    @Email
    private String email;
    @NotNull(message = "pwd cannot be null")
    @Size(min = 2, message = "pwd not be less than 10 char")
    private String password;

}
