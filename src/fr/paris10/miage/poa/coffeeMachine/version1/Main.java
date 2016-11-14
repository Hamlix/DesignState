package fr.paris10.miage.poa.coffeeMachine.version1;

/**
 * Created by naviller on 14/11/2016.
 */
public class Main {
    public static void main(String[] args){
        MachineACafe c = new MachineACafe();

        c.give(1);
        c.askCoffey();
        c.give(10);
        c.askTea();
        c.askCoffey();
    }
}
