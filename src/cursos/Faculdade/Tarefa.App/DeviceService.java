package GestorPessoas;

public class DeviceService {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isMaiorIdade() {
        return idade >= 18;
    }

    public boolean isIdadePar() {
        return idade % 2 == 0;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}
