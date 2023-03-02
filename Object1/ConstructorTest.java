class Data1 {
    int value;
}
class Data2 {
    int value;

    Data2(int x) {  // 생성자(매개변수 o)
        value = x;
    }
}

class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
        Data2 d2 = new Data2(10);     // 인스턴스 값을 주지 않으면 에러발생
    }
}
