package Atividade.App;

import java.util.ArrayList;

public class Device {
    private Long id;
    private String marca;
    private String modelo;
    private String memoria;
    private Long armazenamento;
    private ArrayList<Aplicativo> aplicativos;

    public Device() {
    }

    public Device(Long id, String marca, String modelo, String memoria, Long armazenamento, ArrayList<Aplicativo> aplicativos) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.memoria = memoria;
        this.armazenamento = armazenamento;
        this.aplicativos = aplicativos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public Long getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(Long armazenamento) {
        this.armazenamento = armazenamento;
    }

    public ArrayList<Aplicativo> getAplicativos() {
        return aplicativos;
    }

    public void setAplicativos(ArrayList<Aplicativo> aplicativos) {
        this.aplicativos = aplicativos;
    }
}
