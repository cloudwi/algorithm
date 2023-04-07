import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GridMaximumSum2 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine());

    int[][] ints = new int[n][n];

    for (int i = 0; i < n; i++) {
      StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

      for (int j = 0; j < n; j++) {
        ints[i][j] = Integer.parseInt(stringTokenizer.nextToken());
      }
    }

    System.out.println(solution(n, ints));
  }

  private static int solution(int n, int[][] ints) {
    int answer = Integer.MIN_VALUE;
    int sum1, sum2;

    for (int i = 0; i < n; i++) {
      sum1 = sum2 = 0;
      for (int j = 0; j < n; j++) {
        sum1 = sum1 + ints[i][j];
        sum2 = sum2 + ints[j][i];
      }

      answer = Math.max(answer, sum1);
      answer = Math.max(answer, sum2);
    }

    sum1 = sum2 = 0;

    for (int i = 0; i < n; i++) {
      sum1 = sum1 + ints[i][i];
      sum2 = sum2 + ints[i][n - i - 1];
    }

    answer = Math.max(answer, sum1);
    answer = Math.max(answer, sum2);

    return answer;
  }
}
