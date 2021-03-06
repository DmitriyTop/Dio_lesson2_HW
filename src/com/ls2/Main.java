package com.ls2;

public class Main {

    public static void main(String[] args) {
        Person Director = new Person("Sergey", Position.DIRECTOR, "32-85-25-25", "serj@gmail.com");
        Person Engineer = new Person("Sergey", Position.DIRECTOR, "32-85-25-25", "serj@gmail.com");
        //Person Engineer = new Person("Eugene", Position.QA, "12-85-25-25", "eugeng@gmail.com");

        //System.out.println("Director's hashcode is " + Director.toString());
        //System.out.println("Engineer's hashcode is " + Engineer.toString());

        getData(Engineer);

        System.out.println("The result of equation by == is " + (Director==Engineer));
        System.out.println("The result of equation by equals is " + Director.equals(Engineer));

    }

    public static void getData (Person person){
        System.out.println(person.getName() + "'s data below:");
        System.out.println("Name: " + person.getName());
        System.out.println("Position: " + person.getPos());
        System.out.println("Phone: " + person.getPhone());
        System.out.println("E-mail address: " + person.getMail());
    }
}
