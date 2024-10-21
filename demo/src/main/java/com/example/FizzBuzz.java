package com.example;

public class FizzBuzz {

    public String calcularFizzBuzz(int numero) {
        if (esDivisiblePor(numero, 3) && esDivisiblePor(numero, 5)) {
            return "FizzBuzz";
        }
        if (esDivisiblePor(numero, 3) || contieneDigito(numero, 3)) {
            return "Fizz";
        }
        if (esDivisiblePor(numero, 5) || contieneDigito(numero, 5)) {
            return "Buzz";
        }
        return String.valueOf(numero);
    }

    private boolean esDivisiblePor(int numero, int divisor) {
        return numero % divisor == 0;
    }

    private boolean contieneDigito(int numero, int digito) {
        return String.valueOf(numero).contains(String.valueOf(digito));
    }
}
