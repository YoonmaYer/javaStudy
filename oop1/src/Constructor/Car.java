package Constructor;

public class Car {
    String color;
    String gearType;
    int door;

    Car() {
        this("white", "auto", 4);
    }

    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }

    Car(String color) {
        this(color, "auto", 4);
    }

    Car(Car c) {    // 인스턴스의 복사를 위한 생성자
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }
}
