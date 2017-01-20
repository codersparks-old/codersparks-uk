package com.github.codersparks.codersparksuk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by codersparks on 20/01/2017.
 */
@Controller
public class HomeController {

    @RequestMapping(path = "/")
    public String homeDefault() {
        return "index";
    }

    @RequestMapping(path = "/index.html")
    public String home() {
        return "index";
    }
}
