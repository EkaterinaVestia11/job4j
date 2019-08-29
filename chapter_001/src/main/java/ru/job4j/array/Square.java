/**
 * Package for array task.
 *
 * @author Ekaterina Kalashnikova
 * @version $Id$
 * @since 21.08.2019
 */
package ru.job4j.array;
/**
 * Class Square
 * @author Ekaterina Kalashnikova(kalashnikovakaterina477@gmail.com)
 * @since 21.08.2019
 */
public class Square {
    /**
     * @param
     * @return rst
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < rst.length; i++) {
        rst [ i ] = (i + 1) * (i  + 1);
        }
        return rst;
    }
}





