package org.ricodev;

public class Student {
  private   String  name;
    public  void  display(){
        System.out.println("STUDENT NAME IS "+ this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
