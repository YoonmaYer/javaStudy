package arr;

public class arrTest {
    public static void main(String[] args) {

        int[] bigArr = new int[2_147_48355];
        long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기

        for (int i=0; i < bigArr.length; i++) {
            bigArr[i] = (int) (Math.random() * 10) + 1;  // 1~10의 값을 배열에 저장
        }

        for (int i=0; i < bigArr.length; i++) {
            System.out.println(bigArr[i]);
        }
        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime)/1000;
        System.out.println("시간차이(m) : "+secDiffTime);
    }

}
