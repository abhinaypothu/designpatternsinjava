package com.dp.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediater {
    List<User> users;
    ChatMediater(){
        users = new ArrayList<>();
    }

    public void sendMessage(User fromUser,User toUser,String message){
        for(User user:users){
            if(user.getName().equals(toUser.getName()))
                user.receive(fromUser,message);
        }

    }
    public void addUser(User user){
        users.add(user);
    }
}
