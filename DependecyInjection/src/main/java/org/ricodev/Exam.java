package org.ricodev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {


    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");

      Student student=  context.getBean(Student.class);

      student.display();

    }


}
