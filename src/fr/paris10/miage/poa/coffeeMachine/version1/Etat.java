package fr.paris10.miage.poa.coffeeMachine.version1;

/**
 * Created by naviller on 14/11/2016.
 */
public interface Etat {

    Etat give(int n);
    Etat askCoffey();
    Etat askTea();
}
