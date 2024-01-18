package hashset;

import java.util.*;

public class HashSetLotto {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(new Integer(num));  //Integer(int)는 java 9 버전 이후로 사용 x
        }

        List list = new LinkedList(set);
        Collections.sort(list);
        System.out.println(list);
    }
}
