
package command;

/**
 *
 * @author Arttu
 */
public class WallButton {
     Command cmd;
     Command command;
    public WallButton(Command cmd){
        command = cmd;
}
    public void push() {
        command.execute();
}
}
