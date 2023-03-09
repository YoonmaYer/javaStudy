package BlindingTest;

class BlindingTest {
    public static void main(String[] args) {
        Parents p = new Child1();
        Child1 c = new Child1();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Child1 extends Parents {
    int x = 200;

    void method() {
        System.out.println("Child Method");
    }
}