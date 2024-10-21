package com.example;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void devuelveFizzSiEsDivisiblePor3() {
        assertThat(fizzBuzz.calcularFizzBuzz(3), is("Fizz"));
        assertThat(fizzBuzz.calcularFizzBuzz(6), is("Fizz"));
    }

    @Test
    void devuelveBuzzSiEsDivisiblePor5() {
        assertThat(fizzBuzz.calcularFizzBuzz(5), is("Buzz"));
        assertThat(fizzBuzz.calcularFizzBuzz(10), is("Buzz"));
    }

    @Test
    void devuelveFizzBuzzSiEsDivisiblePor3Y5() {
        assertThat(fizzBuzz.calcularFizzBuzz(15), is("FizzBuzz"));
        assertThat(fizzBuzz.calcularFizzBuzz(30), is("FizzBuzz"));
    }

    @Test
    void devuelveNumeroSiNoEsDivisiblePor3Ni5() {
        assertThat(fizzBuzz.calcularFizzBuzz(7), is("7"));
        assertThat(fizzBuzz.calcularFizzBuzz(8), is("8"));
    }

    @Test
    void devuelveFizzSiContieneUn3() {
        assertThat(fizzBuzz.calcularFizzBuzz(13), is("Fizz"));
        assertThat(fizzBuzz.calcularFizzBuzz(31), is("Fizz"));
    }

    @Test
    void devuelveBuzzSiContieneUn5() {
        assertThat(fizzBuzz.calcularFizzBuzz(52), is("Buzz"));
        assertThat(fizzBuzz.calcularFizzBuzz(25), is("Buzz"));
    }
}