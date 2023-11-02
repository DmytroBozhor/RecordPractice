package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Robin", 25);

        System.out.println(person);

        System.out.println(person.age());
        System.out.println(person.name());

        Person person1 = new Person("Ban", 26);

        System.out.println(person.equals(person1));

        person.showPersonInfo();
        person1.showPersonInfo();

        Person person2 = new Person();
        System.out.println(person2);
        person2.showPersonInfo();

    }
}