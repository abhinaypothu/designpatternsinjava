package com.dp.behavioural.command;

public class CommandDemo {
    public static void main(String[] args) {
        Light light = new LightImpl();
        Command command = new LightOnCommand(light);
        command.execute();
        command.undo();


        command = new LightOffCommand(light);
        command.execute();
        command.undo();
    }
}
