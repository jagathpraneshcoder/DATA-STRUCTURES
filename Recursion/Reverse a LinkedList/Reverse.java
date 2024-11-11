//Only the Function is given here

/* 
class Node{
  int data;
  Node next;
}
*/

public static Node reverse(Node head){

  if( head == null || head.next == null ) return head;
  Node newNode = reverse(head.next);
  Node front = head.next;
  front.next = head;
  head.next = null;
  return newNode;
}
