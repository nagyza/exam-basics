
public class BlackJack {
  public static void main(String[] args) {
    Deck deck = new Deck(12);
    System.out.println(deck);
    Card drawn = deck.draw();
    System.out.println(drawn);
    System.out.println(deck);
  }
}
