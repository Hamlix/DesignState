package fr.paris10.miage.poa.coffeeMachine.version1;

import static org.testng.Assert.*;

/**
 * Created by naviller on 14/11/2016.
 */
public class MachineACafeTest {
    @org.testng.annotations.Test
    //Test café
    public void TestAppointCoffe(){
        MachineACafe c = new MachineACafe();

        try{
            //on donne pas assez
            c.give(5);
            try{
                //on donne suffisement
                c.give(25);
                try{
                    c.askCoffee();
                }catch (CoffeeMachineException e){
                    fail();
                }
            }catch (CoffeeMachineException e){
                fail();
            }
        }catch (CoffeeMachineException e){
            fail();
        }
    }

    @org.testng.annotations.Test
    //Test Thé
    public void TestAppointTea(){
        MachineACafe c = new MachineACafe();
        try{
            //on donne pas assez
            c.give(5);
            try{
                //on donne suffisement
                c.give(25);
                try{
                    c.askTea();
                }catch (CoffeeMachineException e){
                    fail();
                }
            }catch (CoffeeMachineException e){
                fail();
            }
        }catch (CoffeeMachineException e){
            fail();
        }
    }

    //NOTE :
    //LES DEUX TESTS SUIVANT ECHOUENT
    //
    //C'EST NORMAL, C'EST L'OBJECTIF

    @org.testng.annotations.Test
    //Sans avoir payer on demande une boisson => doit échouer
    public void TestSansPayer(){
        MachineACafe c = new MachineACafe();
        try{
            if (Math.random()%2 == 0){
                c.askCoffee();}
            else{
                c.askTea();
            }
        }catch (CoffeeMachineException e){
            fail();
        }
    }

    @org.testng.annotations.Test
    //On veut payer lors de la commande => doit échouer
    public void TestPaiementLorsDuChoix(){
        MachineACafe c = new MachineACafe();
        try{
            c.give(50);
            try{
                c.give(5);
            }catch (CoffeeMachineException e){
                fail();
            }
        }catch (CoffeeMachineException e){
            fail();
        }
    }

}