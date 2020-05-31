package ru.job4j.inheritance;

public class Dancer extends Profession {
    private String bodytype; //
    private String musicality;
    private String endurance; //

    public Dancer(String bodytype, String musicality, String endurance) {
        this.bodytype = bodytype;
        this.musicality = musicality;
        this.endurance = endurance;
    }
    public String getBodytype() {
        return this.bodytype;
    }
    public String getMusicality() {
        return this.musicality;
    }
    public String getEndurance() {
        return this.endurance;
    }
    public Dancer() {
        System.out.println("Хореограф сказал : Жизнь в движении, танцевать прекрасно");
    }


}
