package com.telusko;

import com.telusko.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj = (Alien)context.getBean(Alien.class);
        obj.setAge(23);
        System.out.println(obj.getAge());
        obj.Code();







//       Desktop desk = context.getBean("desktop",Desktop.class);
//       desk.compile();
//        Desktop desk2 = context.getBean("desktop",Desktop.class);
//        desk2.compile();







//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj = (Alien)context.getBean("Alien");
//        obj.Code();
//       System.out.println(obj.getAge());
//
////        obj.setAge(23);
////        System.out.println(obj.getAge());
//        laptop l1 =(laptop)context.getBean("laptop2");
//        Desktop desktop =(Desktop)context.getBean("comp");
////        l1.Type();
    }
}
