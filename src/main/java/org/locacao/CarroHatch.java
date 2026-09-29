package org.locacao;

public class CarroHatch implements Carro {

    @Override
    public String alugar() {
        return "Carro hatch alugado";
    }

    public String cancelar(){
        return "Aluguel de carro hatch cancelado";
    }
}
