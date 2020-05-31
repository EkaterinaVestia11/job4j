package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
      Ball ball = new Ball();
      Hare hare = new Hare();
      Bear bear = new Bear();
      Fox fox = new Fox();

      ball.roll();
      hare.tryEat(ball);
      ball.reply();
      ball.sings();

      ball.roll();
      bear.tryEat(ball);
      ball.reply();
      ball.sings();

      ball.roll();
      fox.tryEat(ball);
      ball.reply();
      ball.sings();

      fox.answer(ball);
      fox.Eat(ball);
    }
}
