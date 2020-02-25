package com.fogcoding.controller;

import com.fogcoding.mapper.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ThymeleafController {

    @Autowired
    private Test example;

    @GetMapping("/thymeleaf")
    public String hello(HttpServletRequest request, @RequestParam(value = "_id", required = false, defaultValue = "4") int _id) {
        request.setAttribute("description", example.All1(_id).toString());
        return "thymeleaf";
    }

}
