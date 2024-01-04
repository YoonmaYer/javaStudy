package arr;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] score = new int[]{50,60,70,80,90};
        int k = 1;

        int tmp = score[k+2] + score[4];
        for(int i =0; i < 5; i++) {
            System.out.printf("score[%d]:%d%n",i, score[i]);
        }

    }
}
