public class ExceptionEx6 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0);    // ArithmeticException
            System.out.println(4);
        } catch (Exception e) { //ArithmeticException 대신 Exception을 사용했다.(모든 Exception의 부모)
            System.out.println(5);
        }
        System.out.println(6);
    }
}