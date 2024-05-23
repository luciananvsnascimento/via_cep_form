package com.desafio.viacep.Controller;

import com.desafio.viacep.Entity.ViaCepData;
import com.desafio.viacep.Service.ViaCepService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ViaCepController {
    private final ViaCepService viaCepService;

    public ViaCepController(ViaCepService viaCepService) {
        this.viaCepService = viaCepService;
    }

    @GetMapping("/form")
    public String exibirFormulario() {
        return "form";
    }

    @PostMapping("/form")
    public String salvarDados(@ModelAttribute ViaCepData data) {
        viaCepService.salvarDados(data);
        return "redirect:/form";
    }



}
