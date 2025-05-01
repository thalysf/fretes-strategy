package com.fretes.depois.calculadora.service;

import com.fretes.depois.calculadora.contexto.FreteContexto;
import com.fretes.depois.calculadora.estrategias.FreteExpressoStrategy;
import com.fretes.depois.calculadora.estrategias.FreteNormalStrategy;
import com.fretes.depois.calculadora.estrategias.FreteSedexStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraCompletaFrete {
    private final FreteContexto freteContexto;

    @Autowired
    public CalculadoraCompletaFrete(FreteContexto freteContexto) {
        this.freteContexto = freteContexto;
    }
    // Por mais que ainda exista a escolha do tipo de frete, os detalhes da implementação são abstraídos para o Strategy
    public double processarFrete(String tipoFrete, double peso, double distancia) {
        switch (tipoFrete.toLowerCase()) {
            case "normal":
                freteContexto.setStrategy(new FreteNormalStrategy());
                break;
            case "expresso":
                freteContexto.setStrategy(new FreteExpressoStrategy());
                break;
            case "sedex":
                freteContexto.setStrategy(new FreteSedexStrategy());
                break;
            default:
                throw new IllegalArgumentException("Tipo de frete inválido: " + tipoFrete);
        }
        return freteContexto.calcularFrete(peso, distancia);
    }
}
