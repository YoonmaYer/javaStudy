package prac7;

public class Calculator {
    //field
    //Constructor
    //Method
    void powerOn() {
        System.out.println("전원을 킵니다.");
    }

    int plus(int x, int y) {
        int result = x + y;

        return result;
    }

    double divide(int x, int y) {
        double result = (double) x / (double) y;

        return result;
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }
}
