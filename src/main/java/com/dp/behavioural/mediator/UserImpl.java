package com.dp.behavioural.mediator;

public class UserImpl implements User{
    String name;
    ChatMediater mediater;
    UserImpl(String name,ChatMediater mediater)
    {
        this.name = name;
       this.mediater = mediater;
    }

    @Override
    public void receive(User fromUser, String message) {
        System.out.print(fromUser.getName()+": ");
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
