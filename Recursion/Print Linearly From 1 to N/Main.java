import java.util.*;

class Main {

  static void printLinear(int i, int n) {
    if (i > n)
      return;
    System.out.print(i + " ");
    printLinear(i + 1, n);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Main.printLinear(1, n);
    sc.close();
  }
}
