package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String plan;
    private String design;

    public String getPlan() {
        return plan;
    }
    public String getDesign() {
        return design;
    }

    public Builder() {

    }
    public Builder draws(Builder project) {
        return project;
    }

}
