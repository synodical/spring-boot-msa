package com.example.userservice.vo;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Greeting {
    @Value("${greeting.message}")
    private String message;
}
