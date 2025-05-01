package com.fretes.antes.calculadora;


import org.springframework.stereotype.Service;


@Service
public class CalculadoraSimplesFrete {
    public double calcularFrete(String tipoFrete, double peso, double distancia) {
        double valorFrete;
        switch (tipoFrete) {
            case "normal":
                valorFrete = peso * 0.1 + distancia * 0.05;
                valorFrete += 1.0; // taxa fixa para o tipo normal
                break;
            case "expresso":
                valorFrete = peso * 0.2 + distancia * 0.1;
                valorFrete += 2.0; // taxa fixa para o tipo expresso
                break;
            case "sedex":
                valorFrete = peso * 0.3 + distancia * 0.15;
                valorFrete += 15.0; // taxa fixa por motivo de urgência
                valorFrete += 5.0; // taxa adicional para o tipo sedex
                break;
            default:
                throw new IllegalArgumentException("Tipo de frete inválido: " + tipoFrete);
        }
        return valorFrete;
    }
}
