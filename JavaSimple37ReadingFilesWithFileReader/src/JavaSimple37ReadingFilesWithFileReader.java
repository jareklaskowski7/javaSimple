//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 37; Reading Files With File Reader

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaSimple37ReadingFilesWithFileReader {
    public static void main(String[] args) {
        //File file = new File("/home/jarek/Documents/javaSimple/test.txt");
        File file = new File("C:/Prog/codeWin/javaSimple/customers8.csv");
        BufferedReader br = null;
        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null)
                System.out.println(line);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
