package keila;

import java.util.Scanner;

public class Automoveis {//revenda = 61307 euros/ a vista 8%desc./4x 5% desc./8x 2% desc., mais de 12x2%juros
    //transforme euros em reais 1 euro = R$4,27 / if nos descontos
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorCarroEuro = 61307;
        double taxa = 4.27;
        double valorCarroEmReais = valorCarroEuro * taxa;

        System.out.printf("Bem Vinso a News Cars Zip");
        System.out.printf("Valor do Mazda RX-9 em Eurous: " + valorCarroEuro);
        System.out.printf("Valor do Euro em Reais (taxa de câmbio): " + taxa);
        System.out.printf("Valor do Mazda RX-9 em Reais: " + valorCarroEmReais);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nOpção de pagamentos: ");
            System.out.println("1. Pagar à vista com 8% de desconto");
            System.out.println("2. Parcelar em 4x com 5% de desconto");
            System.out.println("3. Parcelar em 8x com 2% de desconto");
            System.out.println("4. Parcelar em até 12x (valor a vista)");
            System.out.println("5. Sair");
            System.out.println("Escolha uma das opções: ");

            int opcao = scanner.nextInt();
            double valorFinal = 0;

            if (opcao == 1) {
                valorFinal = valorCarroEmReais * 0.92; //8%de desconto
            } else if (opcao == 2) {
                valorFinal = valorCarroEmReais * 0.95; //5% de desconto
            } else if (opcao == 3) {
                valorFinal = valorCarroEmReais * 0.98; //2% de desconto
            } else if (opcao == 4) {
                valorFinal = valorCarroEmReais; //parcela até 12x (valor a vista
                System.out.println("Parcela em até 12x sem juros");
                if (opcao > 12){
                    valorFinal *= 1.02; //2% de juros a partir de 13 parcelas
                }
            } else if (opcao == 5) {
                continuar = false;
                System.out.println("Obrigado por nos visitar. Até mais");
            }else {
                System.out.println("Opção invalida. Escolha uma opção valida");
            }

            if (opcao >= 1 && opcao <= 4){
                System.out.println("Valor final do carro: R$" + valorFinal);
            }
        }
        scanner.close();

    }

}
