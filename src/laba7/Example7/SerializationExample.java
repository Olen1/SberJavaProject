package laba7.Example7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {
    public static void main(String[] args) {
        Person person = new Person("Ivan Ivanov", 30);

        try {
            FileOutputStream fileOut =
                    new FileOutputStream("src/laba7/Example7/person.json");
            ObjectOutputStream out =
                    new ObjectOutputStream(fileOut);

            out.writeObject(person);

            out.close();
            fileOut.close();

            System.out.println("Объект сериализован и сохранён в файл");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}