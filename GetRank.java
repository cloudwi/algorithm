import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class GetRank {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine());

    StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

    int[] ints = new int[n];

    for (int i = 0; i < n; i++) {
      ints[i] = Integer.parseInt(stringTokenizer.nextToken());
    }

    solution(n, ints).forEach(answer -> System.out.print(answer + " "));
  }

  private static List<Integer> solution(int n, int[] ints) {
    List<Integer> integerList = new ArrayList<>();

    for  (int i = 0; i < n; i++) {
      int cnt = 1;
      for (int j = 0; j < n; j++) {
        if (i != j && ints[i] < ints[j]) {
          cnt++;
        }
      }
      integerList.add(cnt);
    }
    return integerList;
  }

}
