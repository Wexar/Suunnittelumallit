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
import java.util.Random;

public class Dice {

    private final static int numberOfSides = 6;

    int rollDice() {

        int result;
        Random randomNumberGenerator = new Random();
        result = randomNumberGenerator.nextInt(numberOfSides) + 1;
        System.out.println("You threw " + result);
        return result;
    }
}
