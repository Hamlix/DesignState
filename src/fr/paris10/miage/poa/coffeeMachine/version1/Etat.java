package fr.paris10.miage.poa.coffeeMachine.version1;

/**
 * Created by naviller on 14/11/2016.
 */
public interface Etat {

    Etat give(int n) throws CoffeeMachineException;
    Etat askCoffee() throws CoffeeMachineException;
    Etat askTea() throws CoffeeMachineException;
}
