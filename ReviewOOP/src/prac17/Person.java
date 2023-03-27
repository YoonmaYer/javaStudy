package prac17;

public class Person {
    final String nation = "Korean";
    final String ssn;
    String name;

    Person(String ssn, String name) {    // final은 생성자에서 값을 준다.
        this.ssn = ssn;
        this.name = name;
    }
}
