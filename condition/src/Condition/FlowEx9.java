package Condition;

import java.util.Scanner;

public class FlowEx9 {
    public static void main(String[] args) {
        char grade = ' ';

        System.out.print("당신의 점수를 입력하세요:");

        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();  //화면을 통해 입력받은 숫자를 score에 저장

        switch (score) {
            //java12 부터 적용되는 표현식
            case 100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90 ->
                    grade = 'A';
            case 89, 88, 87, 86, 85, 84, 83, 82, 81, 80 ->
                    grade = 'B';
            case 79, 78, 77, 76, 75, 74, 73, 72, 71, 70 ->
                    grade = 'C';

            default -> grade = 'F';
                    }
        System.out.println("당신의 학점은 " + grade + "입니다.");
    }
}
