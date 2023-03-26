package prac5;

public class KoreanExample {
    public static void main(String[] args) {

        Korean k1 = new Korean("박자바", "011111-1111111");
        System.out.println(k1.nation);
        System.out.println(k1.name);
        System.out.println(k1.ssn);

        System.out.printf("\n");

        Korean k2 = new Korean("김자바", "111111-0000000");
        System.out.println(k2.nation);
        System.out.println(k2.name);
        System.out.println(k2.ssn);


    }
}
