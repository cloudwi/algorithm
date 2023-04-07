import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Mentoring {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer1 = new StringTokenizer(bufferedReader.readLine());

    int n = Integer.parseInt(stringTokenizer1.nextToken()); //4
    int m = Integer.parseInt(stringTokenizer1.nextToken()); //3


    int[][] ints = new int[m][n];

    for (int i = 0; i < m; i++) {
      StringTokenizer stringTokenizer2 = new StringTokenizer(bufferedReader.readLine());

      for (int j = 0; j < n; j++) {
        ints[i][j] = Integer.parseInt(stringTokenizer2.nextToken());
      }
    }

    System.out.println(solution(n, m, ints));

  }

  private static int solution(int n, int m, int[][] ints) {
    int answer = 0;

    for (int i = 0; i < n; i++) {
      Set<Integer> set = new HashSet<>();

      for (int j = 0; j < m; j++) {
        for (int k = 0; k < n; k++) {
          if (i + 1 == ints[j][k]) {

            break;
          }

          set.add(ints[j][k] + 1);

        }
      }

      answer = answer + (n - 1 - set.size());
    }

    return answer;
  }

}
