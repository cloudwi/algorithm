import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class InvertedDecimal {

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
    List<Integer> answer = new LinkedList<>();

    for (int i = 0; i < n; i++) {
      String str = String.valueOf(ints[i]);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str).reverse();
      str = stringBuilder.toString();

      int num = Integer.parseInt(str);

      if (num != 1 && decimal(num)) {
        answer.add(num);
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
