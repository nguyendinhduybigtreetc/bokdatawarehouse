package com.bokint.datawarehouse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    // Xử lý yêu cầu trang đăng nhập
    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Trả về một trang HTML để hiển thị form đăng nhập
    }
}
