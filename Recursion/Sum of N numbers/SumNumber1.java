import java.util.*;

class SumNumber1 {

  static long sum(int n){
    if(n==1) return 1;
    return n + sum(n-1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long Sum = 0;
    Sum = SumNumber1.sum(n);
    System.out.println(Sum);
    sc.close();
  }
}
