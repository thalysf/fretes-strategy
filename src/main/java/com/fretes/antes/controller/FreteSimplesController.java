package com.fretes.antes.controller;


import com.fretes.antes.calculadora.CalculadoraSimplesFrete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("frete_simples")
public class FreteSimplesController {
    private final CalculadoraSimplesFrete calculadora;

    @Autowired
    public FreteSimplesController(CalculadoraSimplesFrete calculadora) {
        this.calculadora = calculadora;
    }


    @GetMapping("/calcular_frete")
    public double calcularFrete(@RequestParam String tipoFrete, @RequestParam double peso, @RequestParam double distancia) {
        return calculadora.calcularFrete(tipoFrete, peso, distancia);
    }
}
