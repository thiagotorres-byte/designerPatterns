package FactoryMethod;

public class MotoProdutoConcreto extends VeiculoProdutoAbstrato{

    public MotoProdutoConcreto(String nome) {
        super.nome = nome;
        System.out.println("Moto " + nome);
    }
}
