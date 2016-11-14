package fr.paris10.miage.poa.coffeeMachine.version1;

/**
 * Created by naviller on 14/11/2016.
 */
public class EtatAlimentation implements Etat {
    private int sommeTotal;

    public EtatAlimentation() {
        this.sommeTotal = 0;
        System.out.println("Bonjour, veuillez entrer 10 centimes.");
    }


    @Override
    public Etat give(int n){
        sommeTotal+=n;
        if(sommeTotal>=10){
            return new EtatCommande();
        }else{
            System.out.println(String.format("Il manque %1$d centimes",10-sommeTotal));
            return this;

        }
    }

    @Override
    public Etat askCoffey(){
        System.out.println(String.format("Il manque %1$d centimes",10-sommeTotal));
        return this;
    }

    @Override
    public Etat askTea() {
        System.out.println(String.format("Il manque %1$d centimes",10-sommeTotal));
        return null;
    }


}
