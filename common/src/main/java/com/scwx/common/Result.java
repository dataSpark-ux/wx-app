package com.scwx.common;

import lombok.Data;

/**
 * @author wy
 * @Description TODO
 * @createTime 2019/08/22
 */
@Data
public class Result<T> {

    /**
    *code
    */
    private Integer code;
    /**
    *msg
    */
    private String msg;
    /**
    *数据
    */
    private T data;

    public Result(T data) {
        this.data = data;
        this.code = 200;
        this.msg = "success";

    }
}
