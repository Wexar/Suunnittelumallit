/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author Arttu
 */
public class Blastoise implements State {

    @Override
    public void Attack() {
        System.out.println("Blastoise attacks with hydro pump");
    }

    @Override
    public void evolve(Context context) {
       context.setState(new Squirtle());
       System.out.println("Olet nyt Wartotrtle");
    }

    @Override
    public void takeState(Context context) {
        System.out.println("Current stage is blastoise");
        context.setState(this);
    }
    
}
