package prac15;

public class Car {
    int speed;
    void run() {
        System.out.println(speed + "으로 달립니다.");
    }

    public static void main(String[] args) {
        // main도 정적 메서드
        Car myCar = new Car();
        myCar.speed = 60;
        myCar.run();
    }
}
