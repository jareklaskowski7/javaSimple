//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 46; The Transient Keyword And More Serialization

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class JavaSimple46TheTransientKeywordReadObjects {
    public static void main(String[] args) {
        System.out.println("Reading objects");
        try (ObjectInputStream os = new ObjectInputStream(new FileInputStream("test.ser"))) {
            Person person = (Person) os.readObject();
            System.out.println(person);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
