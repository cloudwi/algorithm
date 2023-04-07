import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EratosthenesSieve2 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine());

    System.out.println(solution(n));

  }

  private static int solution(int n) {
    int answer = 0;
    int[] ch = new int[n + 1];
    for (int i = 2; i <= n; i++) {
      if (ch[i] == 0) {
        answer++;
        for (int j = i; j <= n; j = j + i) {
          ch[j] = 1;
        }
      }
    }
    return answer;
  }
}
