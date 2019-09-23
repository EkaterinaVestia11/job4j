package ru.job4j.condition;

public class Triangle{
    private Point first;
    private Point second;
    private Point third;

    public Triangle (Point ap,Point bp,Point cp){
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }
    /**
     * Метод вычисления периметра по длинам сторон.
     * <p>
     * Формула.
     * <p>
     * (a + b + c) / 2
     *
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return Периметр.
     */
    public double period (double a,double b,double c){
        return -1;
    }

    /**
     * Метод должен вычислить площадь треугольника.
     * <p>
     * Формула.
     * <p>
     * √ p *(p - ab) * (p - ac) * (p - bc)
     * <p>
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @param i
     * @param i1
     * @param i2
     * @param i3
     * @param i4
     * @param i5
     * @return Вернуть площадь, если треугольник существует или -1.
     */
    public double area (int i,int i1,int i2,int i3,int i4,int i5){
        double rsl=-1;
        double a=first.distance(second);
        double b=first.distance(third);
        double c=second.distance(third);
        double p=period(a,b,c);
        if ( this.exist(a,b,c) ){
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - a));// написать формулу для расчета площади треугольника.
        } else { rsl = -1;
           }
        return rsl;
    }
    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
     *
     * @param a Длина от точки a b.
     * @param b Длина от точки a c.
     * @param c Длина от точки b c.
     * @return
     */
    private boolean exist(double a, double c, double b) {
        return false;
    }
}