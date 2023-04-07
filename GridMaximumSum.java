import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GridMaximumSum {

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
    int max = Integer.MIN_VALUE;

    //행에서 가장 큰 합 찾기
    for (int i = 0; i < n; i++) {
      int total = 0;

      for (int j = 0; j < n; j++) {
        total = total + ints[i][j];
      }

      if (max < total) {
        max = total;
      }
    }

    //열에서 최대합
    for (int i = 0; i < n; i++) {
      int total = 0;

      for (int j = 0; j < n; j++) {
        total = total + ints[j][i];
      }

      if (max < total) {
        max = total;
      }
    }

    //대각선에서 최대합
    for (int i = 0; i < n; i++) {
      int total = 0;

      total = total + ints[i][i];

      if (max < total) {
        max = total;
      }
    }

    for (int i = 0; i < n; i++) {
      int total = 0;

      total = total + ints[i][(n - 1) - i];

      if (max < total) {
        max = total;
      }
    }

    return max;
  }

}
