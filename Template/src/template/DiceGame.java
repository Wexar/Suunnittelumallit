/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Arttu
 */
public class DiceGame extends Game {
    private int playersCount = 2;
    private int P1Score;
    private int P2Score;
    private int P1Rolls = 0;
    private int P2Rolls = 0;
    Dice dice = new Dice();
    private int CurrentPlayer;
    
    @Override
    void initializeGame() {
    System.out.print("Welcome to dice game! ");
    System.out.print("Here both of you will thorw dice 5 times and the one who gets more points wins " + "\n");  
    }
    
    @Override
    void makePlay(int player) {
    CurrentPlayer=player;
    System.out.println("Press enter to Throw your dices player " + player);
    Scanner keyboard = new Scanner(System.in);
    keyboard.nextLine();    
          if (CurrentPlayer == 1) {
              P1Score = P1Score + dice.rollDice();
              P1Rolls = P1Rolls +1;
              System.out.println("Your total score is " + P1Score);
          }
          else {
             P2Score = P2Score + dice.rollDice();
             P2Rolls = P2Rolls +1;    
             System.out.println("Your total score is " + P2Score);
          }
    }

    @Override
    boolean endOfGame() {
        if (P1Rolls == 5 && P2Rolls == 5) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    void printWinner() {
        if (P1Score > P2Score) {
            System.out.println("Player 1 wins");
        }
        else if (P1Score == P2Score) {
            System.out.println("Draw");
        }
        else {
            System.out.println("Player 2 wins");
        }
    }
    
}
