import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Password {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine());
    String str = bufferedReader.readLine();

    System.out.println(solution(n, str));

  }

  private static String solution(int n, String str) {
    StringBuilder answer = new StringBuilder();

    for (int i = 0; i < n; i++) {
      StringBuilder stringBuilder = new StringBuilder();
      String result = str.substring(i * 7, (i + 1) * 7);

      for (char c : result.toCharArray()) {
        if (c == '#') {
          stringBuilder.append(1);
        } else {
          stringBuilder.append(0);
        }
      }

      int binaryToDecimal = Integer.parseInt(stringBuilder.toString(), 2);
      char c = (char) binaryToDecimal;
      answer.append(c);

    }

    return answer.toString();
  }

}
