import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Scoring {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine());

    StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

    int[] ints = new int[n];

    for (int i = 0; i < n; i++) {
      ints[i] = Integer.parseInt(stringTokenizer.nextToken());
    }

    System.out.println(solution(n, ints));

  }

  private static int solution(int n, int[] ints) {
    int answer = 0;

    int cnt = 0;
    for (int i = 0; i < n; i++) {
      if (ints[i] == 1) {
        cnt++;
        answer = answer + cnt;
      } else {
        cnt = 0;
      }
    }

    return answer;
  }

}
