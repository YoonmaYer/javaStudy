package arr;

public class ArrayEx5 {
    public static void main(String[] args) {
        //배열의 모든 요소를 더해서 총합과 평균을 구한다
        int sum = 0;
        float average = 0f;

        int[] score = {100, 88, 100, 100, 90};

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        average = sum / (float)score.length;    // 계산결과를 float로 얻기 위해 형 변환

        System.out.println("총점: " + sum);
        System.out.println("평균: " + average);
    }
}
