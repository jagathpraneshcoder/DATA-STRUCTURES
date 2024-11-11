public class Reverse {

  static void reverse(int[] arr,int i,int j){
    if(i >= j) return; 

    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    reverse(arr, i+1, j-1);
  }

  public static void main(String[] args) {
    int[] arr =  new int[]{10,9,8,7,6,5,4,3,2,1};
    
    for(int i =0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    int front=0,back=arr.length-1;
    Reverse.reverse(arr,front,back);

    for(int i =0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }  
}
