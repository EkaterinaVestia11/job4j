package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StringCompare1Test {
    @Test
    public void whenStringsAreEqualThenZero () {
        StringCompare1 compare = new StringCompare1();
        int rst = compare.compare(
                "Ivanov",
                "Ivanov"
        );
        assertThat(rst, is(0));
    }

    @Test
    public void whenLeftLessThanRightResultShouldBeNegative () {
        StringCompare1 compare = new StringCompare1();
        int rst = compare.compare(
                "Ivanov",
                "Ivanova"
        );
        assertThat(rst, lessThan(0));
    }

    @Test
    public void whenLeftGreaterThanRightResultShouldBePositive () {
        StringCompare1 compare = new StringCompare1();
        int rst = compare.compare(
                "Petrov",
                "Ivanova"
        );
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void secondCharOfLeftGreaterThanRightShouldBePositive(){
        StringCompare1 compare = new StringCompare1();
        int rst = compare.compare(
                "Petrov",
                "Patrov"
        );
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void secondCharOfLeftLessThanRightShouldBeNegative(){
        StringCompare1 compare = new StringCompare1();
        int rst = compare.compare(
                "Patrova",
                "Petrov"
        );
        assertThat(rst, lessThan(0));
    }

    @Test
    public void whenCharsOfAreEqualThenZero () {
        StringCompare1 compare = new StringCompare1();
        int rst = compare.compare(
                "Petrov",
                "Petrov"
        );
        assertThat(rst, is(0));
    }

    @Test
    public void whenIndexTwoLessThanResultShouldBeNegative () {
        StringCompare1 compare = new StringCompare1();
        int rst = compare.compare(
                "Vetrov",
                "Vedrov"
        );
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void whenIndexTwoGreaterThanShouldBePositive(){
        StringCompare1 compare = new StringCompare1();
        int rst = compare.compare(
                "Vedrov",
                "Vetrov"
        );
        assertThat(rst, lessThan(0));
    }

    @Test
    public void whenIndexAreEqualThenZero () {
        StringCompare1 compare = new StringCompare1();
        int rst = compare.compare(
                "Vetrov",
                "Vetrov"
        );
        assertThat(rst, is(0));
    }
}
