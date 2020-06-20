package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

/**
 * Package-info
 * @author Ekaterina Kalashnikova
 * @version #Id#
 * @since 28.08.2019
 */
public class ArrayDuplicateTest {

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
      String[] input = {"Berckut", "Bax", "Mif", "Bax", "Coroleva", "Bax", "Paulina", "Mif"};
      String[] except = {"Berckut", "Bax", "Mif", "Coroleva", "Paulina"};
      ArrayDuplicate unique = new ArrayDuplicate();
      String[] result = unique.arrayDuplicate(input);
      assertThat(result, arrayContainingInAnyOrder(except));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate1() {
        String[] input = {"1", "2", "3", "2", "4", "5", "5"};
        String[] except = {"1", "3", "5", "4", "2"};
        ArrayDuplicate unique = new ArrayDuplicate();
        String[] result = unique.arrayDuplicate(input);
        assertThat(result, arrayContainingInAnyOrder(except));
    }
}
