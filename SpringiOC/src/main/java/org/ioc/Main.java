package org.ioc;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");

        System.out.println("config file loaded");
   Staff staff= context.getBean("doctor",Staff.class);
      staff.assist();
//       doctor.setQualificication("under graduate ");
//
//        System.out.println( doctor.getQualificication());


//       ! using the id to get the object
        /*
        ? we need to type cast in order to 
        *   */

//Staff staff=  context.getBean(Nurse.class);

//! EXAMPLE OF A CONSTRUCTOR INJECTION
//        ConstructorInjection injection=context.getBean(ConstructorInjection.class);
//
//
//        System.out.println(injection.getQualifiction());
//staff.assist();



    }
}