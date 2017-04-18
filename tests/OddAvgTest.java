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

}