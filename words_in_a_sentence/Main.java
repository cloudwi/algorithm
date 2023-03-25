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
    String answer = "";
    String[] strArr = str.split(" ");

    for (String result : strArr) {
      if (answer.length() < result.length()) {
        answer = result;
      }
    }

    return answer;
  }
}
