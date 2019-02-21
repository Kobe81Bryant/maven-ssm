package com.kobe.vo;

import lombok.Data;

@Data
public class Response<T> {
    private Integer code=200;
    private T data;
    private String message;
}
