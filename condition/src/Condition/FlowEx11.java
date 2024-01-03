package Condition;

import java.util.Scanner;

public class FlowEx11 {
    public static void main(String[] args) {
        System.out.print("당신의 주민번호를 입력하세요:");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();
        char gender = regNo.charAt(7); //입력받은 번호의 8번째 문자를 gender에 저장

       String result = switch (gender) {
            case '1', '3' -> switch (gender) {
                case '1' -> "당신은 2000년 이전에 출생한 남자입니다.";
                case '3' -> "당신은 2000년 이후에 출생한 남자입니다.";
                default -> "유효하지 않은 주민등록번호입니다.";
                };
            case '2', '4' -> switch (gender) {
                case '2' -> "당신은 2000년 이전에 출생한 여자입니다.";
                case '4' -> "당신은 2000년 이후에 출생한 여자입니다.";
                default -> "유효하지 않은 주민등록번호입니다.";
                };
            default -> "유효하지 않은 주민등록번호입니다.";
        };
        System.out.println(result);
    }
}
