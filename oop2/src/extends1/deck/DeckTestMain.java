package extends1.deck;

public class DeckTestMain {
    public static void main(String[] args) {


    Deck d = new Deck();
    Card c = d.pick(0); // 섞기 전 제일 위의 카드를 뽑는다
        System.out.println(c);


        d.shuffle();
        c = d.pick(0);
        System.out.println(c);

}}
