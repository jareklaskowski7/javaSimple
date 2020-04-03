//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 44; Serialization: Saving Objects to Files

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class JavaSimple44SerializationReadObjects {
    public static void main(String[] args) {
        System.out.println("Reading objects");
        try (FileInputStream fi = new FileInputStream("people.bin")) {
            ObjectInputStream os = new ObjectInputStream(fi);
            Person person1 = (Person) os.readObject();
            Person person2 = (Person) os.readObject();
            os.close();
            System.out.println(person1);
            System.out.println(person2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
