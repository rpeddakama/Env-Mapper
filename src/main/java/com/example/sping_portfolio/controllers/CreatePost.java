package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CreatePost {
@RequestMapping("/createpost")
    public String createpost() {
        return "createpost";
    }
}
