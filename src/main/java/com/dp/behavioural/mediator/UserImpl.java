package com.dp.behavioural.mediator;

public class UserImpl implements User{
    String name;
    ChatMediater mediater;
    UserImpl(String name)
    {
        this.name = name;
        mediater = new ChatMediater();
        mediater.addUser(this);
    }

    @Override
    public void receive(User fromUser, String message) {
        System.out.println("Received from "+fromUser.getName());
        System.out.println(message);
    }

    @Override
    public void send(User toUser, String message) {
        mediater.sendMessage(this, toUser, message);
    }

    @Override
    public String getName() {
        return name;
    }
}
