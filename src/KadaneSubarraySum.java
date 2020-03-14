public class KadaneSubarraySum {

  public static void main(String[] args) {
    int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
    int [] b = {-2, -2, 3 , 0 , 4 , -7};

    System.out.println(solution(b));
  }


    public static int solution(int[] A) {
      // write your code in Java SE 8
      int max =Integer.MIN_VALUE;
      int max_end = 0;
      for (int i = 0; i < A.length; i++) {
        max_end = max_end + A[i];
        if (max<max_end) max = max_end;
        if (max_end<0) max_end = 0;
      }
      return max;
    }



}
