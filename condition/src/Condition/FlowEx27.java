package Condition;

import java.util.Scanner;

public class FlowEx27 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean flag = true;    //while문의 조건식으로 사용될 변수
        Scanner scanner = new Scanner(System.in);

        System.out.println("합계를 구할 숫자를 입력하세요:(0 입력시 종료)");

        while(flag) {
            System.out.print(">>");

            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp);
            if(num != 0) {
                sum += num; // num이 0이 아니면, sum에 더함
            } else {
                flag = false;   //num이 0이면, flag의 값을 false로 변경
            }
        }
        System.out.println("합계:" + sum);
    }
}
