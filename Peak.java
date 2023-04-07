import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Peak {

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
    int[][] corners = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        boolean check = true;

        for (int k = 0; k < corners.length; k++) {
          int iTmp = i + corners[k][0];
          int jTmp = j + corners[k][1];

          if (iTmp >= 0 && iTmp < n && jTmp >= 0 && jTmp < n) {
            if (ints[iTmp][jTmp] >= ints[i][j]) {
              check = false;
            }
          }
        }

        if (check) {
          answer++;
        }
      }
    }

    return answer;
  }

}
