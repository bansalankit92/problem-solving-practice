import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueStringNKABC {

  public static void main(String[] args) {
    List<String> a = Arrays.asList(solution(9,100));
    System.out.println(a.toString());
    System.out.println(a.size());
  }

  public static String[] solution(int N, int K) {
    if (N == 0) {
      return new String[] {""};
    }
    ArrayList<String> result = new ArrayList<String>();
    for (String p : solution(N - 1, K - 1)) {
      for (char l : new char[] {'a', 'b', 'c'}) {
        int pLen = p.length();
        if (pLen == 0 || p.charAt(pLen - 1) != l) {
          result.add(p + l);
        }
      }
    }
    int prefSize = Math.min(result.size(), K);
    return result.subList(0, prefSize).toArray(new String[prefSize]);
  }

}
