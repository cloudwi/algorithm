import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class InvertedDecimal2 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine());

    StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

    int[] ints = new int[n];
    for (int i = 0; i < n; i++) {
      ints[i] = Integer.parseInt(stringTokenizer.nextToken());
    }

    solution(n, ints).forEach(x -> System.out.print(x + " "));


  }

  private static List<Integer> solution(int n, int[] ints) {
    List<Integer> answer = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int tmp = ints[i];
      int res = 0;
      while (tmp > 0) {
        int t = tmp % 10;
        res = res * 10 + t;
        tmp = tmp / 10;
      }
      if (isPrime(res)) {
        answer.add(res);
      }
    }

    return answer;
  }

  private static boolean isPrime(int n) {
    if (n == 1) {
      return false;
    }
    for (int i = 2; i <= (int) Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }

    return true;
  }

}
