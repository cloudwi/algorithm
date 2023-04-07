import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringCompression {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String str = bufferedReader.readLine();

    System.out.println(solution(str));

  }

  private static String solution(String str) {
    int lt = 0;
    int rt = 1;
    int cnt = 1;
    StringBuilder stringBuilder = new StringBuilder();
    str = str + " ";

    while (rt < str.length()) {
      if (str.charAt(lt) == str.charAt(rt)) {
        cnt++;
        lt++;
        rt++;
      } else if (cnt != 1) {
        stringBuilder.append(str.charAt(lt));
        stringBuilder.append(cnt);
        cnt = 1;
        lt++;
        rt++;
      } else {
        stringBuilder.append(str.charAt(lt));
        cnt = 1;
        lt++;
        rt++;
      }
    }

    return stringBuilder.toString();
  }

}
