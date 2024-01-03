package Condition;

import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.print("당신의 점수를 입력하세요:");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        score =Integer.parseInt(tmp);

        switch (score/10) {
            case 10, 9 ->
                grade = 'A';
            case 8 ->
                grade = 'B';
            case 7 ->
                grade = 'C';
            default ->
                grade = 'F';
        }

        System.out.println("당신의 학점은 " + grade + "입니다.");
    }
}
