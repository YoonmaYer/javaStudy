package TvTest1;

public class TvMain {
    public static void main(String[] args) {

        Tv t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널은 " + t.channel + "입니다.");
    }
}
