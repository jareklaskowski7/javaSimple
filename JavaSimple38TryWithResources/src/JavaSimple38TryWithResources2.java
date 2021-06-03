//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 38; Try With Resources 2

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaSimple38TryWithResources2 {
    public static void main(String[] args) {
        File file = new File("/home/jarek/Documents/javaSimple/test.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Can't find file " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file " + file.toString());
        }
    }
}
