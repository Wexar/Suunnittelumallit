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
public class Squirtle implements State {

    @Override
    public void Attack() {
        System.out.println("Squirtle attacks with water gun");
    }

    @Override
    public void evolve(Context context) {
       context.setState(new Wartortle());
       System.out.println("Olet nyt Wartotrtle");
    }

    @Override
    public void takeState(Context context) {
        System.out.println("Current stage is squirtle");
        context.setState(this);
    }
}
