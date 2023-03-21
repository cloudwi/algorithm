import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String str1 = bufferedReader.readLine();
    String str2 = bufferedReader.readLine();

    System.out.println(solution(str1, str2));
  }

  private static int solution(String str1, String str2) {
    int answer = 0;
    str2 = str2.toLowerCase();
    str1 = str1.toLowerCase();

    for (char c : str1.toCharArray()) {
      if (c == str2.charAt(0)) {
        answer++;
      }
    }

    return answer;
  }
}
