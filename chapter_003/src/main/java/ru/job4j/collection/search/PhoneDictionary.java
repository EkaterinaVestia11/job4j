package ru.job4j.collection.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons=new ArrayList<Person>();

    public void add( Person person ) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подошедщих пользователей.
     */
    public ArrayList<Person> find( String key ) {
        ArrayList<Person> result=new ArrayList<>();
        System.out.print("Please enter a search term: ");
        String searchString="нкс";
        String searchString1="Арс";
        String searchString2="537";
        for(Person person : result) {
            if ( result.contains(searchString) == person.equals(key) ){
                result.add(person);
            }
        }
        return  result;
    }
}


