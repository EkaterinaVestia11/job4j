package ru.job4j.ex;

public class FindEl {
    private static FindEl rsl;
    private static String[] value;
    private static Object key;

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        if (value == null) {
            throw new ElementNotFoundException("Value could not be null");
        }
            for (String i : value) {
                if (i.equals(key)) {
                    rsl++;
                }
            }
            return rsl;
        }


    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
               return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
            } catch (Exception e) {
            e.printStackTrace();
        }
    }

        public static void main(String[]args) {
            try {
                indexOf(new String[] {"name "}, "surname ");
            } catch (ElementNotFoundException e) {
                e.printStackTrace();
            }
        }
    }


