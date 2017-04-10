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
public class Wartortle implements State{

    @Override
    public void Attack() {
        System.out.println("Wartortle attacks with water blast");
    }

    @Override
    public void evolve(Context context) {
       context.setState(new Blastoise());
       System.out.println("Olet nyt Blastoise");
    }

    @Override
    public void takeState(Context context) {
        System.out.println("Current stage is wartortle");
        context.setState(this);
    }
    
}
