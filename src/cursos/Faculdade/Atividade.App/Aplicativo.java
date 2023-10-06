package Atividade.App;

import java.util.ArrayList;

public class AplicativoService {
    public ArrayList<Aplicativo> aplicativos = new ArrayList<>();

    public Aplicativo adicionarAplicativo(Aplicativo aplicativo){
        //TODO: desenvolver lógica

        return aplicativo;
    }

    public ArrayList<Aplicativo> listarAplicativo(){
        //TODO: desenvolver lógica

        return this.aplicativos;
    }

    public Aplicativo buscarAplicativo(Long aplicativoId){
        Aplicativo aplicativo = new Aplicativo();
        //TODO: desenvolver lógica

        return aplicativo;
    }

    public Aplicativo editarAplicativo(Long aplicativoId){
        Aplicativo aplicativo = new Aplicativo();
        //TODO: desenvolver lógica

        return aplicativo;
    }

    public Aplicativo editarAplicativo(Long deviceId, Aplicativo aplicativo){
        Aplicativo editedAplicativo = new Aplicativo();
        //TODO: desenvolver lógica

        return editedAplicativo;
    }

    public void excluirAplicativo(Long aplicativoId){
        //TODO: desenvolver lógica

    }
}
