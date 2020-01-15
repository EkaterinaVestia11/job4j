package ru.job4j.ex;

public class FindEl{
    private static FindEl rsl;
    private static String[] value;
    private static Object key;

    public static int indexOf(String[] value,String key) throws ElementNotFoundException {
        int rsl=-1;
        if ( value == null ){
            throw new ElementNotFoundException("Value could not be null");
        }
            for(String i : value)
                if ( i.equals(key) ){
                    rsl++;
                }
            return rsl;
        }

        public static void main ( String[]args){
            try {
                indexOf(new String[]{ "name " },"surname ");
            } catch (ElementNotFoundException e) {
                e.printStackTrace();
            }
        }
    }


