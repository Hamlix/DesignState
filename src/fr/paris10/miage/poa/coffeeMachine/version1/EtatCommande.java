package fr.paris10.miage.poa.coffeeMachine.version1;

/**
 * Created by naviller on 14/11/2016.
 */
public class EtatCommande implements Etat {


    @Override
    public Etat give(int n){
        System.out.println("Vous avez suffisemment d'argent");
        return this;
    }

    @Override
    public Etat askCoffey(){
        System.out.println("Voici votre cafe");
        return new EtatAlimentation();
    }

    @Override
    public Etat askTea(){
        System.out.println("Voici votre the");
        return new EtatAlimentation();
    }
}
