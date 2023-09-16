package keila.atividades.valorMaiorMenor;

import java.util.Scanner;

public class ValorMaiorMenor {
    public static void main(String[] args) {
        Scanner rev = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        int valor = rev.nextInt();

        if (valor < 253){
            for (int i = valor; i <= 252; i += 4){ //Inicia um loop for que começa com o valor inserido pelo usuário (valor), incrementa de 4 em 4 (i += 4), e continua até que i seja menor ou igual a 252.
                System.out.println(i);
            }
        } else if (valor > 253) {
            for (int i = valor; i >= 255; i -= 5){//Inicia um loop for que começa com o valor inserido pelo usuário (valor), decrementa de 5 em 5 (i -= 5), e continua até que i seja maior ou igual a 255.
                System.out.println(i);
            }
        }else {
            System.out.println("O valor é igual a 253, nehum incremento ou decremento necessário.");
        }
        rev.close();
    }
}
