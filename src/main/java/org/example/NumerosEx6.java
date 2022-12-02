package org.example;

public class NumerosEx6 {
    public int mediaNumeros(int num) {
        int cont = 0;
        int result = 0;
        int soma = 0;

        while (num != 0) {
            result = num % 10;
            num/=10;
            soma+=result;
            cont++;
        }
        return soma / cont;
    }
}
