package ru.job4j.Inheritance;

public class Doctor extends Profession {
    private String careful;
    private String humaneness;

    int recipe = 0;

    public Doctor(String careful, String humaneness) {
        this.careful = careful;
        this.humaneness = humaneness;
    }

    public Doctor( ) {
     System.out.println("Добро пожаловать в здоровый образ жизни)))");
    }

    public String getCareful() {
        return this.careful;
    }

    public String getHumaneness() {
        return this.humaneness;
    }

   public <Recipe> Doctor write (Recipe recipe) {
       return null;
   }
}
