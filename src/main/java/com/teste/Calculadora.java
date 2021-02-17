package com.teste;

public class Calculadora {
    int soma = 0;

    public int somar(String expressao) {
	for (String valorSomar : expressao.split("\\+"))
	    soma += Integer.valueOf(valorSomar);
	System.out.println(soma);
	return soma;
    }
}
