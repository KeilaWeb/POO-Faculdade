
package br.chamadaSenha;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class MainFila {

    public static void main(String[] args) throws InterruptedException {
        SistemaSenhas sistema = new SistemaSenhas();
        Scanner scanner = new Scanner(System.in);

        char input;
        do {
            System.out.println(">> Digite 'P' Senha preferencial, 'N' Senha normal, ou 'Q' para sair:");
            input = scanner.next().charAt(0);

            switch (input) {
                case 'P':
                case 'p':
                    sistema.gerarSenhaPreferencial();
                    break;
                case 'N':
                case 'n':
                    sistema.gerarSenhaNormal();
                    break;
                case 'R':
                case 'r':
                    sistema.removerSenhas(); // Remover o último número chamado
                    break;
                case 'Q':
                case 'q':
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }

            sistema.mostrarSenhas();


        } while (input != 'Q' && input != 'q');
    }
}