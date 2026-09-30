package org.locacao;

public class Locacao {

    private static Locacao instance;

    private Carro carro;
    private Seguro seguro;
    private Servico servico;

    public static Locacao getInstance() {
        if (instance == null) {
            instance = new Locacao();
        }
        return instance;
    }
    public void criar(FabricaAbstrata fabrica, String carro){
        this.carro = CarroFactory.obterCarro(carro);
        this.seguro = fabrica.createSeguro();
        this.servico = fabrica.createServico();
    }

    public String emitirSeguro(){return this.seguro.emitirNota();}

    public String emitirServico(){ return  this.servico.emitirNota();}

    public Carro getCarro() {
        return this.carro;
    }
}
