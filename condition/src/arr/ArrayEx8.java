package arr;

public class ArrayEx8 {
    public static void main(String[] args) {
        //배열 요소 섞기2
        int[] ball = new int[45];   //45개의 정수값을 저장하기 위한 배열 생성

        //배열의 각 요소에 1~45의 값을 저장
        for (int i=0; i < ball.length; i++)
            ball[i] = i + 1;    //ball[0]에 1이 저장된다

        int temp = 0;   //두 값을 바꾸는데 사용할 임시 변수
        int j = 0;  // 임의의 값을 얻어서 저장할 변수

        // 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞음
        // 0번째 부터 5번째 요소까지 총 6개 바꿈
        for (int i=0; i < 6; i++) {
            j = (int) (Math.random() * 45); // range 0~44
            temp = ball[i];
            ball[i] = ball[j];
            ball[j] = temp;

            // 포인터 Swap 예제랑 비슷한듯
        }

        // 배열 ball의 앞에서 부터 6개의 요소를 출력
        for(int i=0; i < 6; i++)
            System.out.printf("ball[%d]=%d%n", i, ball[i]);
    }
}
