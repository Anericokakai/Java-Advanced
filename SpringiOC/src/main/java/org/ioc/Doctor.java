package org.ioc;

import org.springframework.stereotype.Component;

@Component
public class Doctor  implements Staff{
    private String  qualificication;


    public Doctor() {
        System.out.println("doctor constructor called");
    }

    public String getQualificication() {
        return qualificication;
    }

    public void setQualificication(String qualificication) {
        this.qualificication = qualificication;
    }

    @Override
    public  void assist(){
        System.out.println("the doctor will always assist patients");
    }
}
