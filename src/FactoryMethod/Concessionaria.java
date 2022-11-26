package FactoryMethod;

public class Concessionaria {
    public static void main(String[] args) {
        FactoryVeiculo factory = new FactoryVeiculo();

        factory.getVeciulo("Rubens", TipoVeiculo.CARRO);
    }
}
