package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest{
    @Test
    public void whenFirstSqMax ( ){
        SqMax check=new SqMax ();
        int result=check.max (5, 4, 2, 2);
        assertThat ( result, is ( 5 ) );
    }
    @Test
    public void whenSecondSqMax ( ){
        SqMax check=new SqMax ();
        int result=check.max (5, 6, 2, 2);
        assertThat ( result, is ( 6 ) );
    }
    @Test
    public void whenThirdSqMax ( ){
        SqMax check=new SqMax ();
        int result=check.max (5, 4, 6, 1);
        assertThat ( result, is ( 6 ) );
    }
    @Test
    public void whenForthSqMax ( ){
        SqMax check=new SqMax ();
        int result=check.max (5, 4, 2, 8);
        assertThat ( result, is ( 8 ) );
    }
    @Test
    public void whenEqualsSqMax ( ){
        SqMax check=new SqMax ();
        int result=check.max (4, 4, 4, 4);
        assertThat ( result, is ( 4 ) );
    }

}
