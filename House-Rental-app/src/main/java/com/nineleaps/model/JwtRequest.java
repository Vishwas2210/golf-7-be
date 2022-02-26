package com.nineleaps.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class JwtRequest {

    @NotBlank
    String email;

    @NotBlank
    String password;
}
