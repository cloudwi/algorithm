import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RockPaperScissors2 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine());

    int[] aArr = new int[n];
    int[] bArr = new int[n];

    StringTokenizer AstringTokenizer = new StringTokenizer(bufferedReader.readLine());
    StringTokenizer BstringTokenizer = new StringTokenizer(bufferedReader.readLine());

    for (int i = 0; i < n; i++) {
      aArr[i] = Integer.parseInt(AstringTokenizer.nextToken());
      bArr[i] = Integer.parseInt(BstringTokenizer.nextToken());
    }

    System.out.println(solution(n, aArr, bArr));
  }

  private static String solution(int n, int[] aArr, int[] bArr) {
    String answer = "";

    for (int i = 0; i < n; i++) {
      if (aArr[i] == bArr[i]) {
        answer = answer + "D\n";
      } else if (aArr[i] == 1 && bArr[i] == 3) {
        answer = answer + "A\n";
      } else if (aArr[i] == 2 && bArr[i] == 1) {
        answer = answer + "A\n";
      } else if (aArr[i] == 3 && bArr[i] == 2) {
        answer = answer + "A\n";
      } else {
        answer = answer + "B\n";
      }
    }
    return answer;
  }

}
