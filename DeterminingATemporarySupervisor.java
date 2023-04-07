import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DeterminingATemporarySupervisor {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine());

    int[][] ints = new int[n][5];

    for (int i = 0; i < n; i++) {
      StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
      for (int j = 0; j < 5; j++) {
        ints[i][j] = Integer.parseInt(stringTokenizer.nextToken());
      }
    }

    System.out.println(solution(n, ints));
  }

  private static int solution(int n, int[][] ints) {
    int answer = 0;
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      int cnt = 0;
      for (int j = 0; j < n; j++) {
        for (int k = 0; k < 5; k++) {
          if (ints[i][k] == ints[j][k]) {
            cnt++;
            break;
          }
        }
      }

      if (cnt > max) {
        max = cnt;
        answer = i + 1;
      }
    }

    return answer;
  }
}
