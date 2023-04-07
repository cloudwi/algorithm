import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxTurnover2 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

    int n = Integer.parseInt(stringTokenizer.nextToken());
    int k = Integer.parseInt(stringTokenizer.nextToken());

    int[] arr = new int[n];

    stringTokenizer = new StringTokenizer(bufferedReader.readLine());

    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(stringTokenizer.nextToken());
    }

    System.out.println(solution(n, k, arr));
  }

  private static int solution(int n, int k, int[] arr) {
    int answer = 0;
    int total = 0;

    for (int i = 0; i < k; i++) {
      total = total + arr[i];
    }

    answer = total;

    for (int i = k; i < n; i++) {
      total = total + arr[i] - arr[i - k];
      answer = Math.max(answer, total);
    }

    return answer;
  }

}
