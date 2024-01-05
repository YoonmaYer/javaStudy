package arr;

public class ArrayEx11 {
    public static void main(String[] args) {
        // 배열 빈도수 구하기(배열 안에 어떤 값이 몇개 저장되어 있는지)
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for (int i=0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10);
            System.out.print(numArr[i]);
        }
        System.out.println();
// 배열 counter에서 배열 numArr에 저장된 값과 일치하는 인덱스의 요소에 저장된 값을 1 증가시킴
        for (int i=0; i < numArr.length; i++) {
            counter[numArr[i]]++;
        }

        for(int i=0; i < numArr.length; i++) {
            System.out.println(i +"의 개수: " + counter[i]);
        }
    }
}
