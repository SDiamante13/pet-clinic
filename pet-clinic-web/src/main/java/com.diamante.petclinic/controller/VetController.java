package com.diamante.petclinic.controller;

import com.diamante.petclinic.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping({"", "/", "/index", "/index.html"})
    public String vetsIndexPage(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
