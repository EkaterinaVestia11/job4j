package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class Fit{

        public static double manWeight(double height) {
            double man = (height - 100) * 1.15;
            return man;
        }

        public static double womanWeight(double height) {
            double woman = (height - 110) * 1.15;
            return woman;
        }

        public static void main(String[] args) {
            double man = manWeight(172);
            double woman = womanWeight(167);
            System.out.println("Man 172 is " + man);
            System.out.println("Woman 167 is " + woman);
        }

    }


