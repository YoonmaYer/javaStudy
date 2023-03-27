package prac16;

public class Singleton {
    // 자기 참조 필드, 자기 참조 객체를 만들어 대입함
    private  static Singleton singleton = new Singleton();
    private Singleton() {}

    static Singleton getInstance() {
        return singleton;
    }
}
