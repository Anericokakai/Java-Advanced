package org.ioc;

import org.springframework.stereotype.Component;

@Component
public class Nurse implements Staff {
    public  void  nurseIntro(){
        System.out.println("hello this is a nurse class");
    }

    @Override
    public void assist() {
        System.out.println("nurses will be here to help the doctor");
    }
}
