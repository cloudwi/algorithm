import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ContinuousSubsequence2 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

    int n = Integer.parseInt(stringTokenizer.nextToken());
    int m = Integer.parseInt(stringTokenizer.nextToken());

    stringTokenizer = new StringTokenizer(bufferedReader.readLine());

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(stringTokenizer.nextToken());
    }

    System.out.println(solution(n, m, arr));
  }

  private static int solution(int n, int m, int[] arr) {
    int answer = 0;
    int sum = 0;
    int lt = 0;

    for (int rt = 0; rt < n; rt++) {
      sum = sum + arr[rt];
      if (sum == m) {
        answer++;
      }
      while (sum >= m) {
        sum = sum - arr[lt++];
        if (sum == m) {
          answer++;
        }
      }
    }

    return answer;
  }
}
