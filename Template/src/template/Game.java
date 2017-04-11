/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

/**
 *
 * @author Arttu
 */
abstract class Game {
    
    protected int playersCount;
    
    abstract void initializeGame();
    
    abstract void makePlay(int player);
    
    abstract boolean endOfGame();
    
    abstract void printWinner();
    
    public final void playOneGmae() {
        
        this.playersCount = 2;
        int j = 0;
        while(!endOfGame()){
            makePlay(j);
            j=(j + 1)%playersCount;
        }
        printWinner();
    }
    
}
