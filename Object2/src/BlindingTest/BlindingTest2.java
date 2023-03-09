package BlindingTest;

class BlindingTest2 {
    public static void main(String[] args) {
        Parents p = new Child2();
        Child2 c = new Child2();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Child2 extends Parents { }    // 아무것도 선언을 해준게 없기 때문에, 조상의 멤버변수를 그대로 사용하게 됨.