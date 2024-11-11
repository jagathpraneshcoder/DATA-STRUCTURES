import java.util.Scanner;

class SumNumber {

  static void sum(int i,long sum){
    if(i<0){
      System.out.println(sum);
      return;
    }
    sum(i-1,sum+i);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    SumNumber.sum(n,0);
    sc.close();
  }
}
