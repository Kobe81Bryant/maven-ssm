package com.kobe.vo;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class Param {
    @NotBlank
    private String name;
    @NotBlank
    private String password;
}
