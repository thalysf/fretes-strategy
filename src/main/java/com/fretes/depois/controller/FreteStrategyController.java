package com.fretes.depois.controller;


import com.fretes.antes.calculadora.CalculadoraSimplesFrete;
import com.fretes.depois.calculadora.contexto.FreteContexto;
import com.fretes.depois.calculadora.service.CalculadoraCompletaFrete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("frete_strategy")
public class FreteStrategyController {
    private final CalculadoraCompletaFrete calculadora ;

    @Autowired
    public FreteStrategyController(CalculadoraCompletaFrete calculadora) {
        this.calculadora = calculadora;
    }

    @GetMapping("/calcular_frete")
    public double calcularFrete(@RequestParam String tipoFrete, @RequestParam double peso, @RequestParam double distancia) {
        return calculadora.processarFrete(tipoFrete, peso, distancia);
    }
}
