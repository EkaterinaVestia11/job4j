package ru.job4.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentSort {
    public static void main(String[] args) {
        List <Attachment> attachments=Arrays.asList(
                new Attachment("image 1" ,100) ,
                new Attachment("image 2" ,34) ,
                new Attachment("image 3" ,13)
        );
        Comparator<Attachment> comparator=new Comparator() {
            @Override
            public int compare( Object o1 ,Object o2 ) {
                Attachment left=(Attachment) o1;
                Attachment right=(Attachment) o2;
                return left.getSize()-right.getSize();
            }
        };
        attachments.sort(comparator);
        System.out.println(attachments);

        Comparator<Attachment> comparator1 =  new Comparator<Attachment>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return left.getSize() - right.getSize();
            }
        };

        ArrayList list=new ArrayList() {
            @Override
            public boolean add( Object o ) {
                System.out.println("Add a new element to list: "+o);
                return super.add(o);
            }
        };
        list.add(100500);

        ArrayList<Integer> list1 = new ArrayList<Integer>() {
            @Override
            public boolean add(Integer o) {
                System.out.println("Add a new element to list: " + o);
                return super.add(o);
            }
        };
    }
}

