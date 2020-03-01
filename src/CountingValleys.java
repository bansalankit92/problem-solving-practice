import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {

  // Complete the countingValleys function below.
  static int countingValleys(int n, String s) {
  int valley = 0;
  Stack<Character> stack  = new Stack<>();
    for (int i= 0;i<s.length();i++) {
      if (stack.empty())
        stack.push(s.charAt(i));
else
      switch (stack.peek()) {
        case 'U': if (s.charAt(i) == 'D') {
          stack.pop();
        } else stack.push(s.charAt(i));

          break;
        case 'D': if (s.charAt(i) == 'U') {
          stack.pop();
          if (stack.empty()){
            valley++;
          }
        } else stack.push(s.charAt(i));
          break;
      }
    }

  return valley;

  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
//    BufferedWriter bufferedWriter = new BufferedWriter(System.out);

    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    String s = scanner.nextLine();

    int result = countingValleys(n, s);
    System.out.println(result);
 //   bufferedWriter.close();

    scanner.close();
  }
}
