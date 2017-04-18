import java.util.List;

public class Deck {
  List<Card> cards;

  public Deck(int numberOfCards) {
    for (int i = 0; i < numberOfCards; i++) {
      if ((i + 4) % 4 == 0) {
        this.cards.add(new Card(stringValue(), "Club"));
      } else if ((i + 4) % 4 == 1) {
        this.cards.add(new Card(stringValue(), "Diamond"));
      } else if ((i + 4) % 4 == 2) {
        this.cards.add(new Card(stringValue(), "Heart"));
      } else {
        this.cards.add(new Card(stringValue(), "Spade"));
      }
    }
  }

  private String stringValue() {
    int numValue = randomValue();
    if (numValue < 10) {
      return Integer.toString(numValue + 1);
    } else if (numValue == 10) {
      return "Jumbo";
    } else if (numValue == 11) {
      return "Dama";
    } else if (numValue == 12) {
      return "Queen";
    } else if (numValue == 13) {
      return "Ace";
    } else {
      return "It can not happen";
    }
  }

  private int randomValue() {
    return (int) ((Math.random() * 13) + 1);
  }
}
