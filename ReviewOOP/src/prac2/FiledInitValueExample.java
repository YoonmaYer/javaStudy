package prac2;

import java.lang.reflect.Field;

public class FiledInitValueExample {
    public static void main(String[] args) {

        FieldInitValue fiv = new FieldInitValue(); // 객체생성
        System.out.println(fiv.byteField); // 0
        System.out.println(fiv.charField); // 공백
        System.out.println(fiv.shortField);
        System.out.println(fiv.intField);
        System.out.println(fiv.longField);

        System.out.println(fiv.booleanField); // false

        System.out.println(fiv.flaotfield); // 0.0
        System.out.println(fiv.doublefield); // 0.0

        System.out.println(fiv.arrField); // null
        System.out.println(fiv.strField); // null



    }
}
