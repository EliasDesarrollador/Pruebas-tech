package PruebasQA;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    @Test
    void testSumar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(5, 3);
        assertEquals(8, resultado);
    }

    @Test
    void testRestar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.restar(10, 4);
        assertEquals(6, resultado);
    }
}
