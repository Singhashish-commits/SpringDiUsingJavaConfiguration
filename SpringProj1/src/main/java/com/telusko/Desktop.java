package com.telusko;

import org.springframework.context.annotation.Configuration;


public class Desktop implements Computer {
     @Override
    public void compile(){
         System.out.println("Compiling using the Desktop");
     }

}
