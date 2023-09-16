package keila.atividades.cadastrarmaquina;

import java.util.Scanner; //importação do scanner, p/ ler a entrada do usuario

public class CadastrarMaquina { //Classe principal
    public static void main(String[] args) { //entrada do programa
        Scanner maq = new Scanner(System.in); // instancia do scanner, recebe a entrada do usuario

        int quantidadedeMaquinas = 0; //declaração das variaveis
        double valorUnitario = 0;
        double valorTotal = 0;

        boolean continuar = true; //variavel que ira controlar o loop para manter o programa executando

        while (continuar) { //loop de continuar o programa até que seja 'false'
            System.out.println("Escolha uma opção:"); //menu
            System.out.println("1 - Cadastrar máquinas");
            System.out.println("2 - Retirar produto de estoque");
            System.out.println("3 - Consultar estoque");
            System.out.println("4 - Encerrar o programa");
            System.out.print("Opção: ");

            int opcao = maq.nextInt(); //lê a opção escolhida pelo usuario

            switch (opcao) { //direciona o fluxo do programa com base na opção escolhida
                case 1: //este bloco lida com o cadastro de máquinas
                    System.out.print("Informe a quantidade de m´áquinas a cadastrar: ");
                    quantidadedeMaquinas = maq.nextInt();
                    System.out.print("Informe o valor unitário das m´quinas: ");
                    valorUnitario= maq.nextInt();
                    valorTotal = quantidadedeMaquinas * valorUnitario;
                    break;
                case 2: //este bloco lida com a retirada de produtos do estoque
                    System.out.print("Informe a quantidade de maquinas a retirardo estoque ");
                    int qtdRetirada = maq.nextInt();
                    if (qtdRetirada <= quantidadedeMaquinas) {//aqui sabemos
                        quantidadedeMaquinas -= qtdRetirada;
                        valorTotal = qtdRetirada * valorUnitario;
                        System.out.println("Retirada com sucesso.");
                    } else {//aqui de boas
                        System.out.println("Quantidade insuficiente em estoque.");
                    }
                    break;
                case 3: //aqui exibe as informações do estoque
                    System.out.println("Quantidade de Máquinas Cadastras: " + quantidadedeMaquinas);
                    System.out.println("Valor Unitário das Máquinas: " + valorUnitario);
                    System.out.println("Valor Total das Máquinas em Estoque: " + valorTotal);
                    break;
                case 4: //aqui encerra o programa
                    continuar = false;
                    System.out.println("Encerrando o programa. Obrigada!");
                    break;
                default: //para lidar com as opções inválidas
                    System.out.println("Opção inválida. Tente outra vez");
            }//fechou o while

        }
        maq.close();//fechou o scanner
    }//fechou o main
}// fechou a classe
