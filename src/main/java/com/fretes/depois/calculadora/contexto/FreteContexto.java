package com.fretes.depois.calculadora.contexto;

import com.fretes.depois.calculadora.estrategias.FreteStrategy;
import org.springframework.stereotype.Component;

@Component
public class FreteContexto {
    FreteStrategy strategy;

    public void setStrategy(FreteStrategy strategy) {
        this.strategy = strategy;
    }

    public double calcularFrete(double peso, double distancia) {
        return strategy.execute(peso, distancia);
    }
}
