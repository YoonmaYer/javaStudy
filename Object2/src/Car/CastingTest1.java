package Car;

class CastingTest1 {
    public static void main(String[] args) {
        Car car = null; // 다형성때문에 null 값 부여
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;   // car = (Car)fe;에서 형변환이 생략된 형태,형변환 생략 가능,업캐스팅
        // car.water(); Car타입의 water()를 호출할 수 없음.
        fe2 = (FireEngine) car; // 자손타입 <- 조상타입,형변환 생략 불가,다운 캐스팅
        fe2.water();
    }
}
