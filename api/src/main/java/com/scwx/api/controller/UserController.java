package com.scwx.api.controller;

import com.scwx.common.Trafe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wy
 * @Description
 * @createTime 2019/08/19
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("test")
    public String test() {
        Trafe t = new Trafe();
        return t.str;
    }
}
