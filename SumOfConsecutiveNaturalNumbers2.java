import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfConsecutiveNaturalNumbers2 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine());
    System.out.println(solution(n));
  }

  private static int solution(int n) {
    int answer = 0;

    int sum = 0;
    int lt = 0;
    int m = n / 2 + 1;
    int[] arr = new int[m];

    for (int i = 0; i < m; i++) {
      arr[i] = i + 1;
    }

    for (int rt = 0; rt < m; rt++) {
      sum = sum + arr[rt];
      if (sum == n) {
        answer++;
      }

      while (sum >= n) {
        sum = sum - arr[lt++];
        if (sum == n) {
          answer++;
        }
      }
    }

    return answer;
  }
}
