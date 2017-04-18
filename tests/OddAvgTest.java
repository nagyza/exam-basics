import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class OddAvgTest {
  @Test
  void oddAverage0To9() {
    OddAvg oddAvg = new OddAvg();
    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      numbers.add(i);
    }
    assertEquals(5, oddAvg.oddAverage(numbers));
  }

  @Test
  void oddAverageNoOddNums() {
    OddAvg oddAvg = new OddAvg();
    List<Integer> numbers = new ArrayList<>();
    numbers.add(2);
    numbers.add(4);
    numbers.add(8);
    assertEquals(0, oddAvg.oddAverage(numbers));
  }

  @Test
  void oddAverageFractional() {
    OddAvg oddAvg = new OddAvg();
    List<Integer> numbers = new ArrayList<>();
    numbers.add(2);
    numbers.add(4);
    numbers.add(8);
    numbers.add(7);
    numbers.add(11);
    numbers.add(11);
    assertEquals(9.666666666666666, oddAvg.oddAverage(numbers));
  }
}