package org.locacao;

public class CarroFactory {

    public static Carro obterCarro(String carro) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.locacao.Carro" + carro);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Carro inexistente");
        }
        if (!(objeto instanceof Carro)) {
            throw new IllegalArgumentException("Carro inválido");
        }
        return (Carro) objeto;
    }
}
