package keila.atividades.avaliacaorh;

import java.util.Scanner;

public class AvaliacaoRH {
    public static void main(String[] args) {
        Scanner rh = new Scanner(System.in);

        System.out.println("Informe o nome do colaborador: ");
        String nomeColaborador = rh.nextLine();//le a entrada do usuario do tipo string

        double maiorNota = 0;
        double menorNota = 10;
        int qtdNotas = 0;
        double somaNotas = 0;

        char continuar = 'S';//variavel que controla o loop do programa

        while (continuar == 'S' || continuar == 's'){
            System.out.println("Informe a nota: ");
            double nota = rh.nextDouble();//lê a nota e armazena na variavel 'nota'

            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }

            qtdNotas++;//o operador ++ é chamado para incrementação em Java,ou seja, para aumentar o valor de uma variavel numerica em 1 unidade
            somaNotas += nota;

            System.out.println("Deseja informar outra nota? (S/N): ");
            continuar = rh.next().charAt(0);
            continuar = Character.toUpperCase(continuar);//lê a entrada do usuário convertendo o caracter em maiúscula
        }

        double media = somaNotas / qtdNotas;//calcula a média das notas dividindo 'somaNotas' pela 'qtdNotas'
        String situacao;

        if (media >= 7.0) {
            situacao = "Colaborador APROVADO";
        } else if (media >= 4.0) {
            situacao = "ADVERTÊNCIA";
        }else {
            situacao = "Risco de DEMISSÃO";
        }

        System.out.println("\nResultado: ");
        System.out.println("\nNome do Colaborador: " + nomeColaborador);
        System.out.println("\nMaior nota: " + maiorNota);
        System.out.println("\nMenor nota: " + menorNota);
        System.out.println("\nQuantidade de  notas: " + qtdNotas);
        System.out.println("\nMédia: " + media);
        System.out.println("\nSituação: " + situacao);

        rh.close();
    }
}
