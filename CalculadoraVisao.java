package tdd_e_junit;

import java.util.Scanner;

public class CalculadoraVisao {
    private Scanner scanner;

    public CalculadoraVisao() {
        scanner = new Scanner(System.in);
    }

    // Exibir o menu para o usuário
    public void exibirMenu() {
        System.out.println("Menu da Calculadora:");
        System.out.println("1. Somar");
        System.out.println("2. Subtrair");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Resetar");
        System.out.println("6. Sair");
        System.out.print("Digite sua escolha: ");
    }

    // Obter a escolha do usuário no menu
    public int obterEscolhaUsuario() {
        return scanner.nextInt();
    }

    // Obter um número do usuário
    public int obterNumero(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Exibir o resultado para o usuário
    public void exibirResultado(int resultado) {
        System.out.println("Resultado: " + resultado);
    }

    // Exibir uma mensagem de erro
    public void exibirErro(String mensagem) {
        System.out.println("Erro: " + mensagem);
    }
}
