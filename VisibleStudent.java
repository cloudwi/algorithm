import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VisibleStudent {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine());

    int[] ints = new int[n];

    StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
    for (int i = 0; i < n; i++) {
      ints[i] = Integer.parseInt(stringTokenizer.nextToken());
    }

    System.out.println(solution(n, ints));

  }

  private static int solution(int n, int[] ints) {
    int tmp = ints[0];
    int cnt = 1;

    for (int i = 1; i < n; i++) {
      if (ints[i] > tmp) {
        cnt++;
        tmp = ints[i];
      }
    }
    return cnt;
  }

}
