package tdd_e_junit;

public class CalculadoraControlador {
    private CalculadoraModelo modelo;
    private CalculadoraVisao visao;

    public CalculadoraControlador(CalculadoraModelo modelo, CalculadoraVisao visao) {
        this.modelo = modelo;
        this.visao = visao;
    }

    // Iniciar a aplicação da calculadora
    public void iniciar() {
        boolean sair = false;
        while (!sair) {
            visao.exibirMenu();
            int escolha = visao.obterEscolhaUsuario();
            int a, b;
            switch (escolha) {
                case 1:
                    a = visao.obterNumero("Digite o primeiro número: ");
                    b = visao.obterNumero("Digite o segundo número: ");
                    modelo.somar(a, b);
                    visao.exibirResultado(modelo.getResultado());
                    break;
                case 2:
                    a = visao.obterNumero("Digite o primeiro número: ");
                    b = visao.obterNumero("Digite o segundo número: ");
                    modelo.subtrair(a, b);
                    visao.exibirResultado(modelo.getResultado());
                    break;
                case 3:
                    a = visao.obterNumero("Digite o primeiro número: ");
                    b = visao.obterNumero("Digite o segundo número: ");
                    modelo.multiplicar(a, b);
                    visao.exibirResultado(modelo.getResultado());
                    break;
                case 4:
                    a = visao.obterNumero("Digite o primeiro número: ");
                    b = visao.obterNumero("Digite o segundo número: ");
                    try {
                        modelo.dividir(a, b);
                        visao.exibirResultado(modelo.getResultado());
                    } catch (ArithmeticException e) {
                        visao.exibirErro(e.getMessage());
                    }
                    break;
                case 5:
                    modelo.resetar();
                    visao.exibirResultado(modelo.getResultado());
                    break;
                case 6:
                    sair = true;
                    break;
                default:
                    visao.exibirErro("Escolha inválida. Por favor, tente novamente.");
            }
        }
    }
}
