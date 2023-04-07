import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ShortestTextDistance2 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

    String str = stringTokenizer.nextToken();
    char t = stringTokenizer.nextToken().charAt(0);

    for (int answer : solution(str, t)) {
      System.out.print(answer + " ");
    };
  }

  private static int[] solution(String str, char t) {
    int num = 1000;
    int[] ints = new int[str.length()];

    for (int i = 0; i < str.length(); i++) {
      if (t == str.charAt(i)) {
        num = 0;
        ints[i] = num;
      } else {
        num++;
        ints[i] = num;
      }
    }

    for (int i = str.length() - 1; i >= 0; i--) {
      if (t == str.charAt(i)) {
        num = 0;
      } else {
        num++;
        ints[i] = Math.min(ints[i], num);
      }
    }

    return ints;
  }
}
