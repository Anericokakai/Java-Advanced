package org.ricodev;

public class Student {
    private String name;
    private String regNo;

    public Student(String name, String regNo) {
        this.name = name;
        this.regNo = regNo;
    }


    public void display() {
        System.out.println("STUDENT NAME : " + this.name + "\n STUDENT REG NO : " + this.regNo);
    }


}
