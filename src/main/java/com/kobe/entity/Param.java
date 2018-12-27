package com.kobe.entity;

import lombok.Data;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Data
public class Param {
    @NotEmpty
    private String name;
    private Integer age;
}
