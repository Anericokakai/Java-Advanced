package com.ricodev.springbootannotations;

import com.ricodev.springbootannotations.Controller.NamesController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAnnotationsApplication {

    public static void main(String[] args) {
      var context=  SpringApplication.run(SpringBootAnnotationsApplication.class, args);

//      ? access a bean  created using the component annotation
        NamesController nAmesController=context.getBean(NamesController.class);
        System.out.println(nAmesController.getMyName());
    }

}
