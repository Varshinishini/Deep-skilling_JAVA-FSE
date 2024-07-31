package CommandPatternExample;

public class TestCommandPattern {
    public static void main(String[] args) {
        // Create the receiver
        Light livingRoomLight = new Light();

        // Create commands
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Create invoker
        RemoteControl remote = new RemoteControl();

        // Execute commands
        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(lightOff);
        remote.pressButton();
    }
}