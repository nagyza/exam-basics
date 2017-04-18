import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Copy {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("copy [source] [destination]");
    } else if (args.length < 2) {
      System.out.println("No destination provided");
    } else {
      writeFile(args[1], args[2]);
    }
  }

  private static void writeFile(String fileToRead, String fileToWrite) {
    Path pathToWrite = Paths.get(fileToWrite);
    try {
      Files.write(pathToWrite, readFile(fileToRead));
    } catch (IOException ex) {
      System.out.println("Something wrong with the files.");
    }
  }

  private static List<String> readFile(String fileToRead) {
    Path filePath = Paths.get(fileToRead);
    List<String> lines = new ArrayList<>();
    try {
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("Something wrong with the files which should be copied");
    }
    return lines;
  }
}
