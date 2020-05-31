package ru.job4j.inheritance;

public class Folk extends Dancer {
    private Integer stretching;

    public Folk() {
      System.out.println("Танцуй Россия!");
    }

    public Integer stretching() {
        return this.stretching;
    }


    public Dancer dance(Dancer scene) {
        return scene;
    }

}
