package ru.job4j.Inheritance;

public class Chemistry extends Teacher {
    private Integer substance;
    private Integer experiments;

    public Integer getSubstance() {
        return this.substance;
    }
    public Integer getExperiments() {
        return this.experiments;
    }

    public Chemistry() {

    }

    public Chemistry mixes(Chemistry reagent) {
        return reagent;
    }

}
