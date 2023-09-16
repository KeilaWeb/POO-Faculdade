package keila.atividades.parimpar;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner joga = new Scanner(System.in);

        char continuar = 'S';
        while (continuar == 'S') {
            System.out.println("===========================");

            System.out.println("Digite o primeiro número: ");
            double num1 = joga.nextDouble();

            System.out.println("Digite o segundo número: ");
            double num2 = joga.nextDouble();

            System.out.println("Escolha uma operação:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("Opção: ");
            int opcao = joga.nextInt();

            double resultado = 0;

            switch (opcao){
                case 1:
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    resultado = num1 * num2;
                    break;
                case 4:
                    resultado = num1 / num2;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
            System.out.println("Resultado: " + resultado);

            if (resultado % 2 == 0) {
                System.out.println("O resultado é PAR");
            }else {
                System.out.println("O resultado é IMPAR.");
            }
        }
        joga.close();
    }
}
