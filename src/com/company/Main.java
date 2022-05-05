package com.company;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.setfirsAndLasttName("Tom Jack");
        student.seteMail("jack.tom@gmail.com");
        student.setAge(38);

        System.out.println(student.getfirsAndLasttName() + "\n" + student.geteMail() + "\n" + student.getAge());
    }
}
