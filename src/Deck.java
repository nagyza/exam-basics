import java.util.List;

public class Deck {
  List<Card> cards;


  String stringValue() {
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

  int randomValue() {
    return (int) ((Math.random() * 13) + 1);
  }
}
