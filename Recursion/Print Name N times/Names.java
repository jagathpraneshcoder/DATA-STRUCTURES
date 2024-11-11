import java.util.*;
class Names{

  static void printName(int i,int n,String name){
    if(i>n) return ;
    System.out.println(name);
    printName(i+1, n, name);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    int n = sc.nextInt();
    Names.printName(1,n,name);
    sc.close();
  }
}