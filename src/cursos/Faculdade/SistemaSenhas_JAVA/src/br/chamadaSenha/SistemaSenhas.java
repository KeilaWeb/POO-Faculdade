package br.chamadaSenha;
import java.util.LinkedList;
import java.util.Queue;
public class SistemaSenhas {
    //Cores e formas do conteúdo
    public static final String BOLD = "\u001B[1m";
    public static final String LIGHT = "\u001B[0m";
    public static final String BRANCO = "\u001B[39m";
    public static final String YELLOW = "\u001B[33m";
    public static final String GREEN = "\u001B[32m";

    // Filas para senhas comuns e preferenciais
    private Queue<Senha> filaComum;
    private Queue<Senha> filaPreferencial;

    // Números das últimas senhas geradas
    private int ultNumeroNormal;
    private int ultNumeroPreferencial;

    // Senha atual que está sendo atendida
    private Senha senhaAtual;



    public SistemaSenhas() {
        this.filaComum = new LinkedList<>();
        this.filaPreferencial = new LinkedList<>();
        this.ultNumeroNormal = 0;
        this.ultNumeroPreferencial = 0;
        this.senhaAtual = null;
    }


    // Métodos para gerar senhas comuns e preferenciais
    public void gerarSenhaNormal() {
        filaComum.offer(new Senha("N", ++ultNumeroNormal));
        if (senhaAtual == null) {
            senhaAtual = filaComum.peek();
        }
    }
    public void gerarSenhaPreferencial() {
        filaPreferencial.offer(new Senha("P", ++ultNumeroPreferencial));
        if (senhaAtual == null) {
            senhaAtual = filaPreferencial.peek();
        }
    }


    public Senha getSenhaAtual() {
        return senhaAtual;
    }


    // Método para remover senhas e chamar a próxima
    public void removerSenhas() {
        if (senhaAtual != null) {
            if ("P".equals(senhaAtual.getTipo())) {
                filaPreferencial.remove(senhaAtual);
            }else if ("N".equals(senhaAtual.getTipo())) {
                filaComum.remove(senhaAtual);
            }
            senhaAtual = null;
        } else {
            System.out.println("Nenhuma senha chamada para remover.");
        }
        if (!filaPreferencial.isEmpty()) {
            chamarProximo(filaPreferencial);
        } else if (!filaComum.isEmpty()) {
            chamarProximo(filaComum);
        } else {
            System.out.println("Fila vazia. Nenhum número para chamar.");
        }
    }


    // Método para chamar a próxima senha em uma fila
    public void chamarProximo(Queue<Senha> fila) {
        Senha proximaSenha = fila.poll();

        if (proximaSenha != null) {
            senhaAtual = proximaSenha;
            System.out.println("Chamando: " + proximaSenha);
        } else {
            System.out.println("Fila vazia. Nenhum número para chamar.");
        }
    }


    // Método para mostrar as senhas nas filas
    public void mostrarSenhas() {
        System.out.println(GREEN + BOLD);
        System.out.println("SENHA NORMAL: " +  filaComum);
        System.out.println(YELLOW + BOLD);
        System.out.println("SENHA PREFERENCIAL: " + filaPreferencial);
        System.out.println(BRANCO + LIGHT);
    }

}