import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringCompression2 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String str = bufferedReader.readLine();

    System.out.println(solution(str));

  }

  private static String solution(String str) {
    String answer = "";
    str = str + " ";
    int cnt = 1;

    for (int i = 0; i < str.length() - 1; i++) {
      if (str.charAt(i) == str.charAt(i + 1)) {
        cnt++;
      } else {
        answer = answer + str.charAt(i);
        if (cnt > 1) {
          answer = answer + String.valueOf(cnt);
          cnt = 1;
        }
      }
    }

    return answer;
  }

}
