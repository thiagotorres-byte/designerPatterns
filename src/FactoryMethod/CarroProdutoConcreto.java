package FactoryMethod;

public class CarroProdutoConcreto extends VeiculoProdutoAbstrato {
    public CarroProdutoConcreto(String nome) {
        super.nome = nome;
        System.out.println("Carro " + nome);
    }
}
