package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
       Student student = new Student();
       Date date = new Date();
       student.setFull_name("Katerina Kalashnikova");
       student.setGroup("Job4j");
       student.setReceipt(new Date());

       System.out.println(" " + student.getFull_name() + "\n study in a group: " + student.getGroup() + "\n beginning with 25.08.2019 and up" + date.toString());
    }
}
