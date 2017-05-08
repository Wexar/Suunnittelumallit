/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author Arttu
 */
public class FlipUpCommand implements Command {
    private Light light;
    public FlipUpCommand(Light light) {
        this.light = light;
}
    @Override // Command
    public void execute() {
        light.turnOn();
}
}
