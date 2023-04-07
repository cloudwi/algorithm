import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class ShortestTextDistance {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

    String str = stringTokenizer.nextToken();
    char t = stringTokenizer.nextToken().charAt(0);

    for (int x : solution(str, t)) {
      System.out.print(x + " ");
    }
  }

  private static int[] solution(String str, char t) {
    List<Integer> answer = new ArrayList<>();
    int[] ints = new int[str.length()];
    Arrays.fill(ints, Integer.MAX_VALUE);

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == t) {
        ints[i] = 0;
        for (int j = 0; j < str.length(); j++) {
          if (j != i && ints[j] > Math.abs(j - i)) {
            ints[j] = Math.abs(j - i);
          }
        }
      }
    }

    return ints;
  }
}
