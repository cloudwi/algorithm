import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class OutputLargeNumbers2 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine());

    int[] ints = new int[n];

    StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

    for (int i = 0; i < n; i++) {
      String num = stringTokenizer.nextToken();
      ints[i] = Integer.parseInt(num);
    }

    for (int x : solution(n, ints)) {
      System.out.print(x + " ");
    }
  }

  private static List<Integer> solution(int n, int[] ints) {
    List<Integer> answer = new ArrayList<>();

    answer.add(ints[0]);
    for (int i = 1; i < n; i++) {
      if (ints[i] > ints[i - 1]) {
        answer.add(ints[i]);
      }
    }

    return answer;
  }
}
