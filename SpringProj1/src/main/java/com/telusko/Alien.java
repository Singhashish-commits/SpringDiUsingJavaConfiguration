package com.telusko;

public class Alien {
    private int age;
    public Computer comp2;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("Setter called");
        this.age = age;
    }

    public Alien(){

        System.out.println("Object of alien created");
    }
//    public Alien(int age , laptop l){
//        this.age = age;
//        this.l2 = l;
//    }
    public void Code(){
        System.out.println("Coding");
        comp2.compile();
    }

    public Computer getComp() {
        return comp2;
    }

    public void setComp(Computer comp2) {
        System.out.println("USing comp2 in xml");
        this.comp2 = comp2;
    }
}

// while defining the object of some other class we can autowire them in xml file directly by creating
// object, and we don't need to use the property tag just call autowire in bean thag of the class which is
// calling the other class object