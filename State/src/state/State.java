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
public interface State {
    public void takeState(Context context);
    public void Attack();
    public void evolve(Context context);
}
