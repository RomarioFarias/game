package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GameDto {

    @NotBlank
    private String name;
}
