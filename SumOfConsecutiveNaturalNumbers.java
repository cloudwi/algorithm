import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfConsecutiveNaturalNumbers {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine());
    System.out.println(solution(n));
  }

  private static int solution(int n) {
    int answer = 0;
    int total = 0;
    int lt = 1;

    for (int rt = 1; rt < n; rt++) {

      if (total == n) {
        answer++;
        total = total + rt;
      } else if (total < n) {
        total = total + rt;
      }

      while (total > n) {
        total = total - lt++;
      }

    }

    return answer;
  }
}
