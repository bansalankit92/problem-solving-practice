import java.util.stream.IntStream;

public class ConsectiveNumberList {


  public static  int solution(int A, int B) {
    int cnt = 0;
    // write your code in Java SE 8
//    IntStream.range(A,B).forEachOrdered(i->{
//      double sqrt = Math.sqrt(i);
//      if(sqrt*(sqrt+1) == i) cnt++;
//    });

    return IntStream.range(A,B+1).reduce(0,(total,i)->{
      int sqrt = (int) Math.floor(Math.sqrt(i));
      if(sqrt*(sqrt+1) == i)    ++total;
      return total;
    });

  }

  public static void main(String[] args) {
    System.out.println(solution(5,20));
  }

}
