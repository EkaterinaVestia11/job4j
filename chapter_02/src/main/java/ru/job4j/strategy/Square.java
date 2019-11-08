package ru.job4j.strategy;

/**
 * @author Ekaterina Kalashnikova(kalashnikovakaterina477@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Square implements Shape {

   @Override
    public String draw () {
        StringBuilder pic = new StringBuilder();
        pic.append("++++++++++").append(ps);
        pic.append("+        +").append(ps);
        pic.append("+        +").append(ps);
        pic.append("++++++++++").append(ps);
        return pic.toString();
    }
}
