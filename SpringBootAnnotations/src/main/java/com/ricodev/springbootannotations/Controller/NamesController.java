package com.ricodev.springbootannotations.Controller;

import com.ricodev.springbootannotations.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NamesController {


//    ! field injection
    @Autowired
    private   StudentService studentService;

/*
! CONSTRUCTOR  INJECTION
-> WE HAVE USED CONSTRUCTOR INJECTION
 todo WE NEED TO ANNOTATE IT WITH THE @autowired
*/
//    @Autowired
//    public NamesController(StudentService studentService){
//        this.studentService=studentService;
//    }

//  !  USING SETTERS TO AUTOWIRE

//    @Autowired
//    public  void  setStudentService( StudentService studentService){
//        this.studentService=studentService;
//    }
    public  String  getMyName(){

        return  studentService.printStuentsEmail();

    }
}
