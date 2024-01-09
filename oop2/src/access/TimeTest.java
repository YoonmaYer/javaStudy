package access;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(12, 35, 30);
        System.out.println(t);
       // t.hour= 13; // private이므로 접근 불가, 컴파일 에러
        t.setHour(t.getHour()+1);   // 현재시간 + 1
        System.out.println(t);      // == System.out.println(t.toString());
    }
}
