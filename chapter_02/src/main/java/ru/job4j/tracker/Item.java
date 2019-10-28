package ru.job4j.tracker;

public class Item {
    private String id;
    private String name;

    public Item (String name) {
        this.name = name;
    }

    public Item () {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName () {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("items{");
        sb.append("id = ' ").append(id).append(" ' ");
        sb.append(", name = ' ").append(name).append(" ' ");
        sb.append('}');
        return sb.toString();
    }
}
