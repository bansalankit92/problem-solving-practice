import java.util.HashMap;
import java.util.Map;

public class SubarraySumZeroCnt {

  public static void main(String[] args) {
    int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
    int [] b = {2, -2, 3 , 0 , 4 , -7};

    System.out.println(solution(b));
  }


  public static int solution(int[] A) {
    // write your code in Java SE 8

    long count =0;
    long total = 0;
    Map<Long,Integer> map = new HashMap<>();
    for (int i = 0; i < A.length; i++) {

      total += A[i];
      if (total == 1000000000) return -1;
     if (total==0 || (A[i]==0) || map.containsKey(total) ){
       count++;
     }
       map.put(total, A[i]);
    //  System.out.println(map);

    }
    if (total ==0) count++;
    if (count>=100000) return -1;
    return (int)count;
  }

}
