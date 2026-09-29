package org.locacao;

public class Parametros {

    private Parametros() {};
    private static Parametros instance = new Parametros();
    public static Parametros getInstance() {
        return instance;
    }

    private String nomeLocadora;
    private int valorDiariaPadrao;
    private int limiteDiasLocacao;

    public static void setInstance(Parametros instance) {
        Parametros.instance = instance;
    }

    public String getNomeLocadora() {
        return nomeLocadora;
    }

    public void setNomeLocadora(String nomeLocadora) {
        this.nomeLocadora = nomeLocadora;
    }

    public int getValorDiariaPadrao() {
        return valorDiariaPadrao;
    }

    public void setValorDiariaPadrao(int valorDiariaPadrao) {
        this.valorDiariaPadrao = valorDiariaPadrao;
    }

    public int getLimiteDiasLocacao() {
        return limiteDiasLocacao;
    }

    public void setLimiteDiasLocacao(int limiteDiasLocacao) {
        this.limiteDiasLocacao = limiteDiasLocacao;
    }
}
