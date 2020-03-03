package ru.job4j.tracker;

import org.jetbrains.annotations.NotNull;

public class Item<I extends Number> extends Number implements Comparable<Item> {
    private String id;
    private String name;

    public Item( ) {
        this.id = id;
        this.name = name;
    }

    public Item (String name) {
        this.name = name;
    }

    public Item( int i ,String name ) {
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

    public void add( Item<Number> item ) {
    }

    @Override
    public int compareTo( @NotNull Item items ) {
     int res = this.id.compareTo(items.id);
         if(res == 0) {
             res = this.name.compareTo(items.name);
         }
         return res;
    }
}
