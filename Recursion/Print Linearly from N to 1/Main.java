import java.util.*;
class Main {

  static void printLinear(int n,int i){
    if(n<i) return ;
    System.out.print(n+" ");
    printLinear(n-1, i);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Main.printLinear(n,1);
    sc.close();
  }  
}
