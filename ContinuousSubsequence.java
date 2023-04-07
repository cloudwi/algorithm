import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ContinuousSubsequence {

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
    int lt = 0;
    int rt = 0;
    int total = arr[rt];

    while (rt < n - 1) {
      if (total == m) {
        answer++;
        total = total - arr[lt++];
      } else if (total > m) {
        total = total - arr[lt++];
      } else if (total < m) {
        total = total + arr[++rt];
      }
    }

    if (total == m) {
      answer++;
    }

    return answer;
  }
}
