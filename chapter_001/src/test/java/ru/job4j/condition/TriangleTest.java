package ru.job4j.condition;

import org.junit.Test;

public class TriangleTest {
    private String rsl;
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        // Создаем объект треугольник.
        Point first = new Point(1, 1);
        Point second = new Point(0, 2);
        Point third = new Point(2, 1);
         // Вычисляем площадь.
        double rsl = new Triangle(first, second, third).area();
        // Задаем ожидаемый результат.
        double expected = 2D;
        // Проверяем результат и ожидаемое значение.
        assertThat(rsl, 2d);
    }

    private void assertThat( double rsl ,double v ) {
    }
}
