package com.dp.behavioural.mediator;

public class MediaterExample {
    public static void main(String[] args) {
        User user1 = new UserImpl("User1");
        User user2 = new UserImpl("User2");
        ChatMediater mediater = new ChatMediater();
        mediater.addUser(user1);
        mediater.addUser(user2);
        user1.send(user2,"Hello");
        user2.send(user1,"Hi");
        user1.send(user2,"How are you?");
        user2.send(user1,"I am fine");

    }
}
