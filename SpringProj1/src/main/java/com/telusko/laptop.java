package com.telusko;

public class laptop implements Computer {
//    public laptop(){
//        System.out.println("Laptop Object");
//    }
    public void Type(){
        System.out.println("WorkStation Laptop");
    }
    @Override
    public void compile(){
        System.out.println("Compiling Using Laptop ");
    }
}
