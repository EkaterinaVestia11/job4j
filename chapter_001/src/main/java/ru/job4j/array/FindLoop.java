package ru.job4j.array;

public class FindLoop{
    public int indexOf (int[] data,int el){
        int rst=-1; // если элемента нет в массиве, то возвращаем -1.
        for(int index=0; index<data.length; index++) {
            if ( data[ index ] == el ){
                rst=index;
                break;
            }
        }
        return rst;
    }

    public int indexOf (int[] data,int el,int start,int finish){
        int rst=-1; // если элемента нет в массиве, то возвращаем -1.
        for(int i=0; i<finish; i++) {
            if ( start<=finish ){
                for(int index=0; index<data.length; index++) {
                    if ( data[ index ] == el ){
                        rst=index;
                    }
                }


            }
        }
        return rst;
    }
}

