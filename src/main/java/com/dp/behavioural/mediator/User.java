package com.dp.behavioural.mediator;

public interface User {
    public void receive(User fromUser,String message);
    public String getName();
    public void send(User toUser,String message);
}
