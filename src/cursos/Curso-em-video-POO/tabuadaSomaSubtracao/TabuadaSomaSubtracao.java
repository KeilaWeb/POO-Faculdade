package keila.atividades.tabuadaSomaSubtracao;

import java.util.Scanner;

public class TabuadaSomaSubtracao {
    public static void main(String[] args) {
        Scanner tabu = new Scanner(System.in);
        char continuar = 'S';

        while (continuar =='S'){
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Tabuada");
            System.out.println("2 - Soma");
            System.out.println("3 - Subtração");
            System.out.print("Opção: ");
            int opcao = tabu.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite um número: ");
                    int numeroTabuada = tabu.nextInt();
                    System.out.println("tabuada de " + numeroTabuada + ":");
                    for (int i = 0; i <= 10; i++){
                        System.out.println(numeroTabuada + " x " + i + " = " + (numeroTabuada * i));
                    }
                    break;
                case 2:
                    int somaTotal = 0;
                    for (int i = 1; i <= 35; i += 2){
                        somaTotal += i;
                        System.out.print(i + " ");
                        if (somaTotal % 2 == 0){
                            System.out.println("PAR");
                        }else {
                            System.out.println("IMPAR");
                        }
                        }
                    System.out.println("Soma total: " + somaTotal);
                    break;
                case 3:
                    System.out.println("Digite um número: ");
                    int numroSub = tabu.nextInt();
                    int subTotal = 0;
                    if (numroSub >= 55){
                        for (int i = 1; i <= 10; i++){
                            subTotal -= numroSub;
                            System.out.println(numroSub + " - " + i + " = " + (numroSub - i));
                            if ((numroSub - i) % 2 ==0){
                                System.out.println("PAR");
                            }else {
                                System.out.println("IMPAR");
                            }
                        }
                    }else {
                        for (int i = 10; i >= 1; i--){
                            subTotal -= 10;
                            System.out.print("10 - " + i + " = " + (10 - i));
                            if ((10 - i) % 2 == 0){
                                System.out.println("PAR");
                            }else {
                                System.out.println("IMPAR");
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Opção Inválida.");
            }
            System.out.print("\nDeseja escolher outra opção Aritmética? (S/N): ");
            continuar = tabu.next().charAt(0);
            continuar =Character.toUpperCase(continuar);
        }
        tabu.close();
    }
}
