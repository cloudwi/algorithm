import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mentoring2 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer1 = new StringTokenizer(bufferedReader.readLine());

    int n = Integer.parseInt(stringTokenizer1.nextToken()); //4
    int m = Integer.parseInt(stringTokenizer1.nextToken()); //3


    int[][] arr = new int[m][n];

    for (int i = 0; i < m; i++) {
      StringTokenizer stringTokenizer2 = new StringTokenizer(bufferedReader.readLine());

      for (int j = 0; j < n; j++) {
        arr[i][j] = Integer.parseInt(stringTokenizer2.nextToken());
      }
    }

    System.out.println(solution(n, m, arr));
  }

  private static int solution(int n, int m, int[][] arr) {
    int answer = 0;

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        int cnt = 0;

        for (int k = 0; k < m; k++) {
          int pi = 0;
          int pj = 0;

          for (int l = 0; l < n; l++) {
            if (arr[k][l] == i) {
              pi = l;
            }
            if (arr[k][l] == j) {
              pj = l;
            }
          }

          if (pi < pj) {
            cnt++;
          }
        }

        if (cnt == m) {
          answer++;
        }
      }
    }

    return answer;
  }
}
