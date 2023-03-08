final class Singleton {
    private static Singleton s = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance() {
        if(s==null)
            s = new Singleton();

        return s;
    }
}
class SingletonTest {
    public static void main(String[] args) {
       // Singleton s= new Singleton(); private는 인스턴스를 생성할 수 없다.
        Singleton s = Singleton.getInstance();
    }
}
