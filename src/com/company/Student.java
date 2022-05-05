package com.company;

public class Student {
    private String firsAndLasttName;
    private String eMail;
    private int age;


    public String getfirsAndLasttName() {
        return firsAndLasttName;
    }

    public void setfirsAndLasttName(String firsAndLasttName) {
        this.firsAndLasttName = firsAndLasttName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getAge() {
        if(age <= 0) {
            System.out.println("This is negative age!");
        } else {

        }
        return age;
    }

    public void setAge(int age) {
            this.age = age;
        }
}

