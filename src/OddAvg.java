import java.util.List;

public class OddAvg {
  public static void main(String[] args) {

  }

  public double oddAverage(List<Integer> numbers) {
    double sumOfOdds = 0.0;
    int numOfOdds = 0;
    for (Integer number : numbers) {
      if (number % 2 != 0) {
        sumOfOdds += number;
        numOfOdds++;
      }
    }
    if (numOfOdds == 0) {
      return 0;
    } else {
      return sumOfOdds / numOfOdds;
    }
  }
}
