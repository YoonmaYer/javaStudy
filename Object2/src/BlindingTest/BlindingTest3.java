package BlindingTest;

class BlindingTest3 {
    public static void main(String[] args) {
        Parents p = new Child3();
        Child3 c = new Child3();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class        Child3 extends Parents {
    int x = 200;

    void method() {
        System.out.println("x=" + x);   // == this.x
        System.out.println("super.x=" + super.x);   // 복습: super는 부모 클래스의 멤버 접근
        System.out.println("this.x=" + this.x);     // 복습: this는 현재 객체의 멤버 접근
    }
}