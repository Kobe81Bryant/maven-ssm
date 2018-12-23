package com.kobe.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class User {
    private Integer id;
    private String name;
    private BigDecimal fee;
}
