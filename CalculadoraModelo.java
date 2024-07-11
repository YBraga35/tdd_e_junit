package tdd_e_junit;

public class CalculadoraModelo {
    private int resultado;

    public CalculadoraModelo() {
        this.resultado = 0;
    }

    // Obter o resultado atual
    public int getResultado() {
        return resultado;
    }

    // Somar dois números e atualizar o resultado
    public void somar(int a, int b) {
        resultado = a + b;
    }

    // Subtrair dois números e atualizar o resultado
    public void subtrair(int a, int b) {
        resultado = a - b;
    }

    // Multiplicar dois números e atualizar o resultado
    public void multiplicar(int a, int b) {
        resultado = a * b;
    }

    // Dividir dois números e atualizar o resultado
    public void dividir(int a, int b) {
        if (b != 0) {
            resultado = a / b;
        } else {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
    }

    // Redefinir o resultado para zero
    public void resetar() {
        resultado = 0;
    }
}
