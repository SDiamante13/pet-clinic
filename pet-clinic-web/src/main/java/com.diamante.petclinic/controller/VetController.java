package com.diamante.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {

    @GetMapping({"", "/", "/index", "/index.html"})
    public String vetsIndexPage() {
        return "vets/index";
    }
}
