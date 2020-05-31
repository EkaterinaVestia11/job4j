package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
       Book romantic = new Book("romantic", 14);
       Book adventure = new Book("adventure", 36);
       Book fantasy = new Book("fantasy", 25);
       Book clean_code = new Book("clean_cod", 5);

       Book[] libro = new Book[4];

       libro[0] = romantic;
       libro[1] = adventure;
       libro[2] = fantasy;
       libro[3] = clean_code;

        System.out.println("All the books that are in front of you: ");
        for (int index = 0; index < libro.length; index++) {
            Book lib = libro[index];
            System.out.println(lib.getName() + " : " + lib.getNumber());
        }

        System.out.println("\n Exchange books: clean_code and romantic");
         int k = libro.length;
         Book tmp;
        for (int i = 0; i < 1; i++) {
            tmp = libro[ 3 ];
            libro[ 3 ] = libro[ 0 ];
            libro[ 0 ] = tmp;
        }
            for (int index = 0; index < libro.length; index++) {
                Book lib = libro[index];
                System.out.println(lib.getName() + "-" + lib.getNumber());
            }

        System.out.println("\n Book selected: clean_code ");
           for (int index = 0; index < libro.length; index++) {
               Book lb = libro[index];
               if (lb.getNumber() <= 5) {
                   System.out.println(lb.getName() + " - " + lb.getNumber());
           }
        }
    }
}
