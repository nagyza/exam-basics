import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
  private List<Card> cards;

  public Deck(int numberOfCards) {
    cards = new ArrayList<>();
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

  public Card draw() {
    Collections.shuffle(this.cards);
    Card toDraw = this.cards.get(this.cards.size() - 1);
    this.cards.remove(this.cards.size() - 1);
    return toDraw;
  }

  private String countColors() {
    int numberOfClubs = 0;
    int numberOfDiamonds = 0;
    int numberOfHearts = 0;
    int numberOfSpades = 0;
    for (Card card : this.cards) {
      if (card.getColor().equals("Club")) {
        numberOfClubs++;
      } else if (card.getColor().equals("Diamond")) {
        numberOfDiamonds++;
      } else if (card.getColor().equals("Heart")) {
        numberOfHearts++;
      } else if (card.getColor().equals("Spade")) {
        numberOfSpades++;
      }
    }
    return numberOfClubs + " Clubs, " + numberOfDiamonds + " Diamonds, "
            + numberOfHearts + " Hearts, " + numberOfSpades + " Spades";
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

  @Override
  public String toString() {
    return Integer.toString(this.cards.size()) + " cards - " + this.countColors();
  }
}
