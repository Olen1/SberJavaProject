
package laba2;


//Создание класса "Человек":
//        •	Создайте класс Person, который содержит поля для имени, возраста и пола человека.
//        •	Добавьте методы, которые позволяют установить и получить значения этих полей.
//•	Добавьте конструктор, который позволяет создавать объекты класса Person, используя значения для имени, возраста и пола.


public class Person {
    private String name;
    private int age;
    private String gender;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}