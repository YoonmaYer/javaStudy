package poly.binding;

public class Child3 extends Parent{
    int x = 200;

    void method() {
        System.out.println("x=" + x);   //==this.x
        System.out.println("super.x=" + super.x);
        System.out.println("this.x=" + this.x);
    }
}
