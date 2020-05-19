package com.lcb.demo.pojo;

import lombok.Data;

@Data
public class Result {
    private int code;
    private String msg;
    private Object data;
}
