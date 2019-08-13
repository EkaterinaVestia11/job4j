package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest{
       @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        //напишите здесь тест, проверяющий, что сумма чётных чисел от 1 до 10 при вызове метода counter.add будет равна 30.
        int start = 1;
        int finish = 10;
        int expected = 30;
        int out = Counter.add(start, finish);//Counter add = new Counter();
           Assert.assertEquals(expected, out);
        //Assert.assertEquals ( expected ,  out  );//assertThat  ( out, is ( 30 ) );
    }
      @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty1() {
        //напишите здесь тест, проверяющий, что сумма чётных чисел от 11 до 15 при вызове метода counter.add будет равна 30.
        int start = 11;
        int finish = 15;
        int expected = 26;
        int out = Counter.add(start, finish);//Counter add = new Counter();
          Assert.assertEquals(expected, out);
    }
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty2(){
        //напишите здесь тест, проверяющий, что сумма чётных чисел от 35 до 40 при вызове метода counter.add будет равна 30.
        int start=35;
        int finish=40;
        int expected=114;
        int out=Counter.add(start,finish);//Counter add = new Counter();
        Assert.assertEquals(expected,out);
    }
}
