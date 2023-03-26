package prac9;

public class Car {
    //Field
    int gas;

    //Constructor
    //Method
    void setGas(int gas) { // set: 변경한다
        this.gas = gas; // 외부로부터 받은 값을 필드에 저장
    }

    boolean isLeftGas() {
        if(gas == 0) {
            System.out.println("gas가 없습니다.");
            return false;
        }
        System.out.println("gas가 있습니다.");
        return true;
    }
    void run() {
        while(true) {
            if(gas > 0) {
                System.out.println("달립니다.(gas잔량:" +gas + ")");
                gas -= 1;
            }else {
                System.out.println("멈춥니다.(gas잔량:" + gas + ")");
                return;
            }
        }
    }
}
