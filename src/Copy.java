import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Copy {
  public static void main(String[] args) {

  }

  private List<String> readFile(String fileName) {
    Path filePath = Paths.get(fileName);
    List<String> lines = new ArrayList<>();
    try {
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("Something wrong with the files which should be copied");
    }
    return lines;
  }
}
