package fr.paris10.miage.poa.coffeeMachine.version1;

/**
 * Created by naviller on 14/11/2016.
 */
public class EtatCommande implements Etat {


    @Override
    public Etat give(int n) throws CoffeeMachineException{
        throw new CoffeeMachineException("Vous avez suffisemment d'argent");
    }

    @Override
    public Etat askCoffee() throws CoffeeMachineException{
        System.out.println("Voici votre cafe");
        return new EtatAlimentation();
    }

    @Override
    public Etat askTea() throws CoffeeMachineException{
        System.out.println("Voici votre the");
        return new EtatAlimentation();
    }
}
