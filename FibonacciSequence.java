import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciSequence {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine());

    for (int answer : solution(n)) {
      System.out.print(answer + " ");
    }

  }

  private static int[] solution(int n) {
    int[] ints = new int[n];

    ints[0] = 1;
    ints[1] = 1;

    for (int i = 2; i < n; i++) {
      ints[i] = ints[i - 2] + ints[i - 1];
    }

    return ints;
  }

}
