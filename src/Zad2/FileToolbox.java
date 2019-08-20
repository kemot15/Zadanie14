package Zad2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileToolbox {
    public static void fileCreator (String path, int qtyNumbers) throws IOException {
        Random random = new Random(100);
        File file = new File(path);
        if (!file.exists()){
            file.createNewFile();
        }
        FileWriter fr = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fr);
        for (int i = 0; i < qtyNumbers; i++){
            bw.write(random.nextInt());
        }
        bw.close();
    }
}
