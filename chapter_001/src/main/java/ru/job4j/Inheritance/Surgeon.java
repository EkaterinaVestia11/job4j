package ru.job4j.Inheritance;

public class Surgeon<Rehab> extends Doctor {
    private Integer anesthesia;
    private Integer operation;

    public Integer getAnesthesia() {
        return anesthesia;
    }

    public Integer getOperation() {
        return operation;
    }

    public Surgeon() {
        System.out.println("Не оставлю в беде");
    }
   int rehab = 0;
    public Doctor spend(Rehab rehab) {
        return spend();
    }

    private Doctor spend ( ){
        return null;
    }
}
