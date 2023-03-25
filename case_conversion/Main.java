import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String str = bufferedReader.readLine();

    System.out.println(solution(str));
  }

  private static String solution(String str) {
    StringBuilder stringBuffer = new StringBuilder();

    for (char c : str.toCharArray()) {
      if (Character.isLowerCase(c)) {
        stringBuffer.append(Character.toUpperCase(c));
      } else {
        stringBuffer.append(Character.toLowerCase(c));
      }
    }

    return stringBuffer.toString();
  }

}
