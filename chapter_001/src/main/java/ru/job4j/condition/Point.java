package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
        private int x;
        private int y;

    public Point(int first, int second) {
            this.x = first;
            this.y = second;
        }
    public double distance (Point that) {
            return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
        }
    public static void main(String[] args) {
            Point a = new Point(0, 0);
            Point a1 = new Point(2, 3);
            Point a2 = new Point(5, 7);
            Point a3 = new Point(2, 5);
            
            Point b = new Point(0, 2);
            Point b1 = new Point(5, 8);
            Point b2 = new Point(9, 11);
            Point b3 = new Point(4, 9);
            
            double dist = a.distance(b);
            double dist1 = a1.distance(b1);
            double dist2 = a2.distance(b2);
            double dist3 = a3.distance(b3);
            
            System.out.println(dist);
            System.out.println(dist1);
            System.out.println(dist2);
            System.out.println(dist3);
        }
     }
