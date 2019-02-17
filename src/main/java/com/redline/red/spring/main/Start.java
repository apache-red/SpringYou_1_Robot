package com.redline.red.spring.main;

import com.redline.red.spring.impls.robot.ModelT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
     //   t1000.action();
//
//        System.out.println("___________________________");
//        ModelT1000 t2000 = (ModelT1000) context.getBean("t2000");
//        t2000.action();
//        System.out.println(t2000);
//        t2000 = (ModelT1000) context.getBean("t2000");
//        t2000.action();
//        System.out.println(t2000);
//        System.out.println("___________________________");
//        ModelT1000 t1000Empty = (ModelT1000) context.getBean("t1000Empty");
//        t1000Empty.action();
//
//        ModelT1000 t1000Singletone = (ModelT1000) context.getBean("t1000Singletone");
//        t1000Singletone.action();
//        System.out.println(t1000Singletone);
//         t1000Singletone = (ModelT1000) context.getBean("t1000Singletone");
//        t1000Singletone.action();
//        System.out.println(t1000Singletone);
//
//        ModelT1000 t1000Prototype = (ModelT1000) context.getBean("t1000Prototype");
//        t1000Prototype.action();
//        System.out.println(t1000Prototype);
//        t1000Prototype = (ModelT1000) context.getBean("t1000Prototype");
//        t1000Prototype.action();
//        System.out.println(t1000Prototype);
//
//        System.out.println("___________________________");
//        ModelT1000 t1000InitDestroy = (ModelT1000) context.getBean("t1000InitDestroy");
//        t1000InitDestroy.action();






    }


}
