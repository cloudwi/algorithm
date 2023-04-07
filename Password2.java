import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Password2 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine());
    String str = bufferedReader.readLine();

    System.out.println(solution(n, str));

  }

  private static String solution(int n, String str) {
    String answer = "";
    for (int i = 0; i < n; i++) {
      String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
      int num = Integer.parseInt(tmp, 2);
      answer = answer + (char) num;
      str = str.substring(7);
    }
    return answer;
  }

}
