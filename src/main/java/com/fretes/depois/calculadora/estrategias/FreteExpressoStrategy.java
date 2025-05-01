package com.fretes.depois.calculadora.estrategias;

public class FreteExpressoStrategy implements FreteStrategy{
    private static final double VALOR_POR_KG = 0.2;
    private static final double VALOR_POR_KM = 0.1;
    private static final double TAXA_FIXA = 2.0;

    @Override
    public double execute(double peso, double distancia) {
        return (peso * VALOR_POR_KG) + (distancia * VALOR_POR_KM) + TAXA_FIXA;
    }
}
