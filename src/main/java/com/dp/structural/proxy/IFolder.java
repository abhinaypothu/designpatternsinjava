package com.dp.structural.proxy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface IFolder {
    public String readFolder(String fileName) throws IOException;
    public String readFolder(File file) throws IOException;
    public boolean writeFolder(String fileName, String content) throws IOException;
    public boolean writeFolder(File file, String content) throws IOException;
}
