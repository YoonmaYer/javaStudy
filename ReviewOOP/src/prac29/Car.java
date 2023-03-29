package prac29;

public class Car {
    //Field
    public int speed;

    //Constructor

    //Method
    public void speedUp() {
        speed += 1;
    }

    public final void stop() {
        System.out.println("자동 멈춤");
        speed = 0;
    }
}
