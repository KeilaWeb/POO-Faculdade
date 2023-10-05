package GestorPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ProjetoPrincipaç {
    private List<Pessoa> pessoas = new ArrayList<>();

    public void addPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void removePessoa(int indice) {
        if (indice >= 0 && indice < pessoas.size()) {
            pessoas.remove(indice);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public Pessoa buscarPessoa(String nome) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equalsIgnoreCase(nome)) {
                return pessoa;
            }
        }
        return null; // Pessoa não encontrada
    }

    public void limparPessoas() {
        pessoas.clear();
    }

    public void ordenarPessoas() {
        Collections.sort(pessoas, Comparator.comparing(Pessoa::getNome));
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }
}
