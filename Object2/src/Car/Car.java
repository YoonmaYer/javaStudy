package Car;

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive, Brrrr~");
    }

    void stop() {
        System.out.println("stop!");
    }
}
    class FireEngine extends Car {
        void water() {
            System.out.println("water!");
        }
    }

