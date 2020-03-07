package ru.job4j.tracker;

public class Item<I extends Number> extends Number implements Comparable<Item> {
    private String id;
    private String name;

    public Item(String name,String id ) {
        this.id = id;
        this.name = name;
    }

    public Item( String name ,int i ) {
        this.name=name;
    }

    public Item( ) {
    }

    @Override
    public int intValue( ) {
        return 0;
    }

    @Override
    public long longValue( ) {
        return 0;
    }

    @Override
    public float floatValue( ) {
        return 0;
    }

    @Override
    public double doubleValue( ) {
        return 0;
    }

    public String getId(){
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
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

    @Override
    public int compareTo( Item item ) {
        return this.name.compareTo(item.getName());
    }
}
