package Facade;

public class ServidorFacade {
    private UnidadeCentralDeProcessamento unidadeCentralDeProcessamento;
    private Memoria memoria;
    private DiscoRigido discoRigido;

    public ServidorFacade() {
        this.unidadeCentralDeProcessamento = new UnidadeCentralDeProcessamento();
        this.memoria = new Memoria();
        this.discoRigido = new DiscoRigido();
    }

    // Método que encapsula e abstrai todos os acessos a submétodos para o usuário
    public void run() {
        unidadeCentralDeProcessamento.processaDado();
        memoria.carregaDado();
        discoRigido.leDado();
    }

    private class UnidadeCentralDeProcessamento {
        public void processaDado(){}
    }

    private class Memoria {
        public void carregaDado(){}
    }

    private class DiscoRigido {
        public void leDado(){}
    }
}
