package ru.job4j.array;

public class Defragment {
    private static String notNullIndex;

    public static String[] compress( String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index; /* указатель на null ячейку. */
                for (point = index + 1; point < array.length; point++) {
                    if (!( array[ point ].equals(notNullIndex))) {

                    }
                }/* переместить первую не null ячейку. Нужен цикл. */
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
