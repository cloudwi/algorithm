import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class OutputLargeNumbers {

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
    List<Integer> integerList = new LinkedList<>();

    int rt = 1;
    int lt = 0;

    integerList.add(ints[0]);

    while (rt < n) {
      if (ints[lt] < ints[rt]) {
        integerList.add(ints[rt]);
      }

      rt++;
      lt++;
    }

    return integerList;
  }
}
