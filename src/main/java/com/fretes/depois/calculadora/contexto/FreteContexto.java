package com.fretes.depois.calculadora.contexto;

import com.fretes.depois.calculadora.estrategias.FreteStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class FreteContexto {
    FreteStrategy strategy;

    private final Map<String, FreteStrategy> estrategias;

    @Autowired
    public FreteContexto(Map<String, FreteStrategy> estrategias) {
        this.estrategias = estrategias;
    }

    public void setStrategy(String tipoFrete) {
        this.strategy = estrategias.get(tipoFrete.toLowerCase());
        if (this.strategy == null) {
            throw new IllegalArgumentException("Tipo de frete inválido: " + tipoFrete);
        }
    }

    public double calcularFrete(double peso, double distancia) {
        return strategy.execute(peso, distancia);
    }
}
