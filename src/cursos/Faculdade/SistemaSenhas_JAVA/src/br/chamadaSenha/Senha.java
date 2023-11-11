
package br.chamadaSenha;

public class Senha {
    private String tipo;
    private int numero;
    private long timestamp;

    public Senha(String tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;
        this.timestamp = System.currentTimeMillis();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return tipo + String.format("%03d", numero);
    }
}

