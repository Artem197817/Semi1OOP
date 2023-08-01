public class Main {
    public static void main(String[] args) {
       Card card1 = new Card("Tom","1234 1234 0000 9088", 100 );
        Card card2 = new CreditCard("Tom","1234 1234 0000 9088", 100 );
        Card card3 = new DepositCard ("Tom","1234 1234 0000 9088", 100 );
        card1.take();
        System.out.println(card1.getCurrent());
        card2.put();
        card2.take();
        System.out.println(card2.getCurrent());
        card3.take();
        System.out.println(card3.getCurrent());
    }
}