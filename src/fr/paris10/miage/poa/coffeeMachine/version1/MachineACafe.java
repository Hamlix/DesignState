package fr.paris10.miage.poa.coffeeMachine.version1;

/**
 * Created by naviller on 14/11/2016.
 */
public class MachineACafe {
    private Etat state;

    public MachineACafe() {
        this.state = new EtatAlimentation();
    }

    public void give(int n) throws CoffeeMachineException{
        this.state=this.state.give(n);
    }

    public void askCoffee() throws CoffeeMachineException{
        this.state=this.state.askCoffee();
    }

    public void askTea() throws CoffeeMachineException{
       this.state=this.state.askTea();
    }
}
