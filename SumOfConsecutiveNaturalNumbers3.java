import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfConsecutiveNaturalNumbers3 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine());
    System.out.println(solution(n));
  }

  private static int solution(int n) {
    int answer = 0;
    int cnt = 1;

    n--;

    while (n > 0) {
      cnt++;
      n = n - cnt;
    }

    return answer;
  }
}
