package stackandqueue;

import javax.crypto.interfaces.PBEKey;
import java.util.*;

public class MyStack extends Vector {
    public Object push(Object item) {
        addElement(item);
        return item;
    }

    public Object pop() {
        Object obj = peek();    // stack에 저장된 마지막 요소 읽어오기
        // 만일 stack이 비어있으면 peek()메서드가 EmptyStackException 발생시킴

        // 마지막 요소 삭제, 배열의 인덱스가 0부터 시작하기 때문에 1 감소
        removeElementAt(size() - 1);
        return obj;
    }

    public Object peek() {
        int len = size();

        if (len == 0)
            throw new EmptyStackException();
        // 마지막 요소 반환, 배열의 인덱스가 0부터 시작하기 때문에 1 감소
        return elementAt(len - 1);
    }

    public boolean empty() {
        return size() == 0;
    }

    public int search(Object o) {
        int i = lastIndexOf(o);

        if (i >= 0) {   // 객체를 찾은 경우
            return size() - 1;
        }
        return -1;
    }

}
