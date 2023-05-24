package com.tutorial.crud;

public class Calculadora {

    public double suma(double num1, double num2){
        return num1 + num2;
    }

    public double multiplicacion(double num1, double num2){
        return num1 * num2;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultadoSuma = calculadora.suma(2.5, 5.0);
        double resultadoMultiplicacion = calculadora.multiplicacion(2.5, 5.0);

        System.out.println("El resultado de la suma es: " + resultadoSuma);
        System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion);
    }
}

