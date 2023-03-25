import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine());
    String[] strArr = new String[n];
    for (int i = 0; i < n; i++) {
      strArr[i] = bufferedReader.readLine();
    }
    solution(n, strArr).forEach(System.out::println);
  }

  private static List<String> solution(int n, String[] strArr) {
    List<String> strList = new ArrayList<>();

    for (String str : strArr) {
      StringBuilder stringBuilder = new StringBuilder(str);

      strList.add(stringBuilder.reverse().toString());
    }

    return strList;
  }

}
