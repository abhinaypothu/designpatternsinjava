package com.dp.structural.proxy;

import java.io.IOException;
import java.util.Date;

public class ProxyDriver {
    public static void main(String[] args) throws IOException {
        User user = new User("dp","CEO");
        User user2 = new User("Abhi","Dev");
        IFolder folder = new FolderProxy(user);
        String content = folder.readFolder("src/main/resources/Proxy");
        System.out.println(content);

        folder.writeFolder("src/main/resources/Proxy", content+" updated");


         folder = new FolderProxy(user);
         content = folder.readFolder("src/main/resources/Proxy");
        System.out.println(content);

        folder = new FolderProxy(user2);
        content = folder.readFolder("src/main/resources/Proxy");
        System.out.println(content);
    }
}
