package org.locacao;

public class CarroSedan implements Carro {

    @Override
    public String alugar() {
        return "Carro sedan alugado";
    }

    public String cancelar(){
        return "Aluguel de carro sedan cancelado";
    }
}
