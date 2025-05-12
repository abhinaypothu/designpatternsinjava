package com.dp.structural.proxy;

import java.io.*;
import java.util.Scanner;

public class Folder implements IFolder{

    @Override
    public String readFolder(String fileName) throws IOException{
        return readFolder(new File(fileName));
    }

    @Override
    public String readFolder(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        reader.lines().forEach(sb::append);
        return sb.toString();
    }

    @Override
    public boolean writeFolder(String fileName, String content) throws IOException{
        return writeFolder(new File(fileName), content);
    }

    @Override
    public boolean writeFolder(File file, String content) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(content);
        writer.close();
        return true;
    }
}
