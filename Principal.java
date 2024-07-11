package tdd_e_junit;

public class Principal {
    public static void main(String[] args) {
        CalculadoraModelo modelo = new CalculadoraModelo();
        CalculadoraVisao visao = new CalculadoraVisao();
        CalculadoraControlador controlador = new CalculadoraControlador(modelo, visao);
        controlador.iniciar();
    }
}
