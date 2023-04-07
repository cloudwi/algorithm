import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EratosthenesSieve {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine());

    System.out.println(solution(n));

  }

  private static int solution(int n) {
    int answer = 0;
    for (int i = 2; i <= n; i++) {
      if (decimal(i)) {
        answer++;
      }
    }
    return answer;
  }

  private static boolean decimal(int n) {
    for (int i = 2; i <= (int) Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }

    return true;
  }
}
