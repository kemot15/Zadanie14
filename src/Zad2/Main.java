package Zad2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String path = "Liczby.txt";
        try {
           // FileToolbox.fileCreator(path, 25);
            List<Integer> numbers = FileToolbox.fileReader(path);
            System.out.println("Liczby w pliku: "+ FileToolbox.fileReader(path));
            showResults(numbers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void showResults (List<Integer> numbers){
        int[] newList = new int[Collections.max(numbers)+1];
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < numbers.size(); i++){
            newList[numbers.get(i)]++;
            treeSet.add(numbers.get(i));
        }
        for (Integer num : treeSet){
            System.out.println(num + " - liczba wystapien: " + newList[num]);
        }
    }
}
