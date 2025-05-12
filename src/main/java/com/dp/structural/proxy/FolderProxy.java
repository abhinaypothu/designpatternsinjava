package com.dp.structural.proxy;

import java.io.File;
import java.io.IOException;

public class FolderProxy implements IFolder{
    private User user;
    FolderProxy(User user)
    {
        this.user = user;
    }
    @Override
    public String readFolder(String fileName) throws IOException {
        if(user.designation.equalsIgnoreCase("CEO") || user.designation.equalsIgnoreCase("Manager"))
        {
            IFolder folder = new Folder();
            return folder.readFolder(fileName);
        }
        throw new UserDontHaveAccessException("User doesn't have access to this folder");

    }

    @Override
    public String readFolder(File file) throws IOException {
        if(user.designation.equalsIgnoreCase("CEO") || user.designation.equalsIgnoreCase("Manager"))
        {
            IFolder folder = new Folder();
            return folder.readFolder(file);
        }
        throw new UserDontHaveAccessException("User doesn't have access to this folder");

    }

    @Override
    public boolean writeFolder(String fileName, String content) throws IOException {
        if(user.designation.equalsIgnoreCase("CEO") || user.designation.equalsIgnoreCase("Manager"))
        {
            IFolder folder = new Folder();
            return folder.writeFolder(fileName,content);
        }
        throw new UserDontHaveAccessException("User doesn't have access to this folder");
    }

    @Override
    public boolean writeFolder(File file, String content) throws IOException {
        if(user.designation.equalsIgnoreCase("CEO") || user.designation.equalsIgnoreCase("Manager"))
        {
            IFolder folder = new Folder();
            return folder.writeFolder(file,content);
        }
        throw new UserDontHaveAccessException("User doesn't have access to this folder");
    }
}
