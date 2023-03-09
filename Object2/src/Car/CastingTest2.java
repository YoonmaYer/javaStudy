package Car;

class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireEngine fe = null;

        car.drive();
        // fe = (FireEngine) car; // 에러 발생, Car는 FireEngine이 될 수 없음
        // fe.drive();
        // car2 = fe;
        // car2.drive();

        fe = new FireEngine(); // FireEngine 인스턴스 생성
        fe.drive(); // Car의 메소드인 drive() 호출
        car2 = fe; // 업캐스팅
        car2.drive(); // Car의 메소드인 drive() 호출
    }
}
