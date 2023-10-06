package Atividade.App;

import java.util.ArrayList;

public class Aplicativo {
    private Long id;
    private String appName;
    private String appId;
    private String versao;
    private String ultimaAtualizacao;

    public Aplicativo() {
    }

    public Aplicativo(Long id, String appName, String appId, String versao, String ultimaAtualizacao) {
        this.id = id;
        this.appName = appName;
        this.appId = appId;
        this.versao = versao;
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(String ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }
}
