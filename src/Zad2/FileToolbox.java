package Zad2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FileToolbox {
    public static void fileCreator (String path, int qtyNumbers) throws IOException {
        Random random = new Random();
        File file = new File(path);
        if (!file.exists()){
            file.createNewFile();
        }
        FileWriter fr = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fr);
        for (int i = 0; i < qtyNumbers; i++){
            int rand = random.nextInt(100);
            bw.write(rand);
            bw.newLine();
        }
        bw.close();
    }

    public static List<Integer> fileReader (String path) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextInt()){
           numbers.add(scanner.nextInt());
        }
        //FileReader fr = new FileReader(file);
//        BufferedReader br = new BufferedReader(fr);
//        String line = null;
//        while ((line = br.readLine()) != null){
//            numbers.add(Integer.valueOf(line));
//            System.out.println(Integer.valueOf(line));
//        }
        return numbers;
    }
}
