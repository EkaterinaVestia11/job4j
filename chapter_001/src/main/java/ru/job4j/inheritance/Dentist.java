package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private Integer dentalDelete;
    private String heal;

    public Dentist(Integer dentalDelete) {
        this.dentalDelete = dentalDelete;
        System.out.println(" Ваша улыбка будет ослепительна)");
    }

    public Integer getDentalDelete() {
        return dentalDelete;
    }

    public String getHeal() {
        return heal;
    }

    int dent = 0;
    public Dentist help(Doctor dent) {
        return null;
    }
}
