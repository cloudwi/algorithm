import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Peak2 {
  private static int[] dx = {-1, 0, 1, 0};
  private static int[] dy = {0, 1, 0, -1};

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
    int answer = 0;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        boolean flag = true;

        for (int k = 0; k < 4; k++) {
          int nx = i + dx[k];
          int ny = j + dy[k];
          if (nx >= 0 && nx < n && ny >= 0 && ny < n && ints[nx][ny] >= ints[i][j]) {
            flag = false;
            break;
          }
        }

        if (flag) {
          answer++;
        }
      }
    }

    return answer;
  }

}
