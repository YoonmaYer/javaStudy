package prac8;

public class Computer {
    //Field
    //Constructor
    //Method
// 자바는 sum1이나 sum2이나 같은 배열객체로 본다.
    int sum1(int[] values) {
        int sum = 0;
        for(int i = 0; i<values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    int sum2(int ...values) {
        int sum = 0;
        for(int i = 0; i<values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
}
