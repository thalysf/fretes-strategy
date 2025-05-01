package com.fretes.depois.calculadora.estrategias;

public class FreteNormalStrategy implements FreteStrategy {
    private static final double VALOR_POR_KG = 0.1;
    private static final double VALOR_POR_KM = 0.05;
    private static final double TAXA_FIXA = 1.0;

    @Override
    public double execute(double peso, double distancia) {
        return (peso * VALOR_POR_KG) + (distancia * VALOR_POR_KM) + TAXA_FIXA;
    }
}
