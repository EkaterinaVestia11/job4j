package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate{
    /**
     * ArrayDuplicate;
     * @param array input array;
     * @return array without uniques;
     */
    public String[] arrayDuplicate (String[] array){
        int unique = array.length;
      for(int out=0; out<unique; out++){
         for(int in=0; in<unique; in++){
             if(array[out].equals(array[in])){
                 array[in] = array[unique-1];
                 unique--;
                 in--;
             }
         }
      }

        return Arrays.copyOf(array, unique);
    }
}
