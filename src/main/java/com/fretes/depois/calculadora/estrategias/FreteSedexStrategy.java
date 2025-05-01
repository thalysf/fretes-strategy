package com.fretes.depois.calculadora.estrategias;

import org.springframework.stereotype.Component;

@Component("sedex")
public class FreteSedexStrategy implements FreteStrategy{
    private static final double VALOR_POR_KG = 0.3;
    private static final double VALOR_POR_KM = 0.15;
    private static final double TAXA_FIXA_URGENCIA = 15.0;
    private static final double TAXA_ADICIONAL_EXPRESSO = 5.0;

    @Override
    public double execute(double peso, double distancia) {
        return (peso * VALOR_POR_KG) + (distancia * VALOR_POR_KM)
                + TAXA_FIXA_URGENCIA + TAXA_ADICIONAL_EXPRESSO;
    }
}
