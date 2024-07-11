package tdd_e_junit;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraModeloTeste {
    private CalculadoraModelo modelo;

    @Before
    public void setUp() {
        modelo = new CalculadoraModelo();
    }

    @Test
    public void testarSoma() {
        modelo.somar(5, 3);
        assertEquals(8, modelo.getResultado());
    }

    @Test
    public void testarSubtracao() {
        modelo.subtrair(5, 3);
        assertEquals(2, modelo.getResultado());
    }

    @Test
    public void testarMultiplicacao() {
        modelo.multiplicar(5, 3);
        assertEquals(15, modelo.getResultado());
    }

    @Test
    public void testarDivisao() {
        modelo.dividir(6, 3);
        assertEquals(2, modelo.getResultado());
    }

    @Test(expected = ArithmeticException.class)
    public void testarDivisaoPorZero() {
        modelo.dividir(6, 0);
    }

    @Test
    public void testarReset() {
        modelo.somar(5, 3);
        modelo.resetar();
        assertEquals(0, modelo.getResultado());
    }
}
