package ru.job4j.inheritance;

public class Drawing extends Teacher {
  private String paints;
  private String pencil;

    public Drawing() {
    }

    public String getPaints() {
        return this.paints;
    }
    public String getPencil() {
        return this.pencil;
    }

    public Teacher draw(Teacher albom) {
        return albom;
    }

}
