package Zad2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "liczby.txt";
        try {
            FileToolbox.fileCreator(path, 25);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
