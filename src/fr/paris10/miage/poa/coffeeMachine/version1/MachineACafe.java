package fr.paris10.miage.poa.coffeeMachine.version1;

/**
 * Created by naviller on 14/11/2016.
 */
public class MachineACafe {
    private Etat state;

    public MachineACafe() {
        this.state = new EtatAlimentation();
    }

    public void give(int n){
        this.state=this.state.give(n);
    }

    public void askCoffey(){
        this.state=this.state.askCoffey();
    }

    public void askTea() {
       this.state=this.state.askTea();
    }
}
