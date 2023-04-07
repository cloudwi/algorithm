import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MergeTwoArrays {

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

    int nt = 0;
    int mt = 0;

    for (int i = 0; i < n + m; i++) {
      if (nt == n && mt != m) {
        answer.add(mArr[mt]);
        mt++;
        continue;
      } else if (mt == m && nt != n) {
        answer.add(nArr[nt]);
        nt++;
        continue;
      } else if (nt == n && mt == m) {
        break;
      }

      if (nArr[nt] > mArr[mt]) {
        answer.add(mArr[mt]);
        mt++;
      } else if (nArr[nt] < mArr[mt]) {
        answer.add(nArr[nt]);
        nt++;
      } else {
        answer.add(mArr[mt]);
        mt++;
      }
    }

    return answer;
  }
}
