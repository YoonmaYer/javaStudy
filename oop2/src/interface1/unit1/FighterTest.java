package interface1.unit1;

public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if (f instanceof Unit)
            System.out.println("f는 Unit 클래스의 자손입니다.");

        if (f instanceof Fightalbe)
            System.out.println("f는 Fightable 인터페이스를 구현했습니다.");

        if (f instanceof Movalbe)
            System.out.println("f는 Movalbe 인터페이스를 구현했습니다.");

        if (f instanceof Attackable)
            System.out.println("f는 Attackable 인터페이스를 구현했습니다.");

        if (f instanceof Object)
            System.out.println("f는 Object 클래스의 자손입니다.");
    }
}
