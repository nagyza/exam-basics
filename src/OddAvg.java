import java.util.List;

public class OddAvg {
  public static void main(String[] args) {

  }

  public static double oddAverage(List<Integer> numbers) {
    int sumOfOdds = 0;
    int numOfOdds = 0;
    for (Integer number : numbers) {
      if (number % 2 != 0) {
        sumOfOdds += number;
        numOfOdds++;
      }
    }
    return sumOfOdds / numOfOdds;
  }

}
