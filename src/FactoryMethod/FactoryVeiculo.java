package FactoryMethod;

public class FactoryVeiculo {
    public VeiculoProdutoAbstrato getVeciulo(String nome, TipoVeiculo tipo){
        if (tipo.equals(TipoVeiculo.CARRO))
            return new CarroProdutoConcreto(nome);
        if (tipo.equals(TipoVeiculo.MOTO))
            return new MotoProdutoConcreto(nome);
        return null;
    }
}
