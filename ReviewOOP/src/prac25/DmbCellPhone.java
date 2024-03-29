package prac25;

public class DmbCellPhone extends CellPhone {
    //Field
    int channel;
    //Constructor
    DmbCellPhone(String model, String color, int channel){
        super(); // 명시적으로 작성하지 않아도 컴파일러가 자동으로 추가해줌.
        this.model = model;
        this.color = color;
        this.channel = channel;
    }
    //Method
    void turnOnDmb() {
        System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
    }
    void changeChannelDmb(int channel) {
        this.channel = channel;
        System.out.println("채널 " + channel + "번으로 바꿉니다.");
    }
    void turnOffDmb() {
        System.out.println("DMB 방송 수신을 멈춥니다.");
    }
}
