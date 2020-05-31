package ru.job4j.inheritance;

public class Music extends Teacher {
    private String play;

    public Music() {
      System.out.println("Tengo la camisa negra...");
    }

    public String getPlay() {
        return this.play;
    }

    public Teacher sing(Teacher song) {
        return song;
    }

}
