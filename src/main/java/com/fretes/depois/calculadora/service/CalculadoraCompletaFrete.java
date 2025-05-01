package com.fretes.depois.calculadora.service;

import com.fretes.depois.calculadora.contexto.FreteContexto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraCompletaFrete {
    private final FreteContexto freteContexto;

    @Autowired
    public CalculadoraCompletaFrete(FreteContexto freteContexto) {
        this.freteContexto = freteContexto;
    }

    public double processarFrete(String tipoFrete, double peso, double distancia) {
        freteContexto.setStrategy(tipoFrete);
        return freteContexto.calcularFrete(peso, distancia);
    }
}
