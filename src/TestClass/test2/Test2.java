package TestClass.test2;

import TestClass.test1.Person;

public class Test2 {
    public static void main(String[] args) {

        Sportsman Bob=new Sportsman("Bob");
        Bob.setName("Bob");
        Bob.displayInfo();
        System.out.println(Bob.getId());
        Sportsman Leonard=new Sportsman("Leonard");
        System.out.println(Leonard.getId());
        Leonard.say();
    }

}
