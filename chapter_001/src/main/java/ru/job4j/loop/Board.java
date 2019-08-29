package ru.job4j.loop;

public class Board {
    public String paint(int width, int height) {
        int i;
        int j;
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (i = 0; i < height; i++) {
            // условие проверки, что писать пробел или X
            // Выше в задании мы определили закономерность, когда нужно проставлять X
            for (j = 0; j < width; j++) {
                if ((i + j) % 2 == 1) {
                    screen.append(" ");
                } else {
                    screen.append("X");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}

