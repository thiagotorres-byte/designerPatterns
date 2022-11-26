package Facade;

public class MaquinaDeLavarFacade {

    private int sabao;

    public void ligarMaquina(){
        System.out.println("Máquina ligada");
    }

    public void adicionarSabado(int sabao){
        this.sabao = sabao;
    }

    public void baterRoupa(){
        adicionarSabado(100);
        ligarMaquina();
    }

}
