package ru.job4j.array;


public class Turn{

        public int[] back(int[] array) {

            for (int i = 0; i < array. length; i++) {//выводим числа исх
            }
                int k = array.length;//общее количество элементов
                int temp; //временная переменная
            for(int i = 0; i < k / 2; i++ ) {//просматриваем половину массива и меняем: кладем элемент из временной переменной
                temp = array[k - i - 1];//чтобы вынуть элемент из массива с обратной стороны
                // для перекладывания лобщее количество сдвигаем (на счетчик и к соседу),чтобы не уйти за пределы
                array[k - i - 1] = array[i];//забираем элемент
                array[i] = temp;// и кладем в temp
            }
            for (int i = 0; i < array. length; i++) {//перевернытые числа
            }
            return array;
        }

}
