package ru.job4j.strategy;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.strategy.Shape.ps;

public class PaintTest{

    /**
     * @author Ekaterina Kalashnikova(kalashnikovakaterina477@gmail.com)
     * @version $Id$
     * @since 0.1
     */

    @Test
    public void whenDrawSquare ( ){
        // получаем ссылку на стандартный вывод в консоль.
        PrintStream stdout=System.out;
        // Создаем буфур для хранения вывода.
        ByteArrayOutputStream out=new ByteArrayOutputStream ();
        //Заменяем стандартный вывод на вывод в пямять для тестирования.
        System.setOut (new PrintStream (out));
        // выполняем действия пишушиее в консоль.
        new Paint ().draw (new Square ());
        // проверяем результат вычисления
        assertThat (new String (out.toByteArray ()),is (new StringBuilder ()
                        .append ("++++++++++").append (ps)
                        .append ("+        +").append (ps)
                        .append ("+        +").append (ps)
                        .append ("++++++++++").append (ps)
                        .append(System.lineSeparator())
                        .toString ()
                )
        );
        // возвращаем обратно стандартный вывод в консоль.
        System.setOut(stdout);
    }

    @Test
    public void whenDrawTriangle ( ){
        PrintStream stdout=System.out;
        ByteArrayOutputStream out=new ByteArrayOutputStream ();
        System.setOut (new PrintStream (out));
        new Paint ().draw (new Triangle ());
        assertThat (new String (out.toByteArray ()),is (new StringBuilder ()
                        .append ("       +       ").append (ps)
                        .append ("     +++++     ").append (ps)
                        .append ("   +++++++++   ").append (ps)
                        .append (" +++++++++++++ ").append (ps)
                        .append ("+++++++++++++++").append (ps)
                        .append(System.lineSeparator())
                        .toString ()
                )
        );
        System.setOut(stdout);
    }
}
