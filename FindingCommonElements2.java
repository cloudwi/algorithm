import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class FindingCommonElements2 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine());

    int[] nArr = new int[n];
    StringTokenizer nStringTokenizer = new StringTokenizer(bufferedReader.readLine());

    for (int i = 0; i < n; i++) {
      nArr[i] = Integer.parseInt(nStringTokenizer.nextToken());
    }

    int m = Integer.parseInt(bufferedReader.readLine());

    int[] mArr = new int[m];
    StringTokenizer mStringTokenizer = new StringTokenizer(bufferedReader.readLine());

    for (int i = 0; i < m; i++) {
      mArr[i] = Integer.parseInt(mStringTokenizer.nextToken());
    }

    solution(n, nArr, m, mArr).forEach(answer -> System.out.print(answer + " "));
  }

  private static List<Integer> solution(int n, int[] nArr, int m, int[] mArr) {
    List<Integer> answer = new ArrayList<>();

    Arrays.sort(nArr);
    Arrays.sort(mArr);

    int p1 = 0;
    int p2 = 0;

    while (p1 < n && p2 < m) {
      if (nArr[p1] == mArr[p2]) {
        answer.add(nArr[p1++]);
        p2++;
      } else if (nArr[p1] < mArr[p2]) {
        p1++;
      } else {
        p2++;
      }
    }

    return answer;
  }

}
