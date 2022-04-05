// queue using linklist

class QueueClass{
  
  static class Node{
    int data;
    Node next;
    
    Node(int data){
      this.data=data;
      this.next=null;
    }
  }
  
  static class Queue{
    
    static Node head=null;
    static Node tail=null;
    
    static boolean isEmpty(){
      return head==null & tail==null;
    }
    
    // enqueue 
    public static void enqueue(int data){
      Node newNode = new Node(data);
      if(isEmpty()){
        head=newNode;
        tail=newNode;
      }
      tail.next=newNode;
      tail=newNode;
    }
    
    //dequeue
    public static int dequeue(){
      if(isEmpty()){  
        System.out.println("empty Queue");
        return -1;
      }
      if(head==tail){
        tail=null;
      }
      int top=head.data;
      head=head.next;
      return top;
    }
    
    //peek
    public static int peek(){
      if(isEmpty()){
        System.out.println("empty queue");
        return -1;
      }
      return head.data;
    }
    
    
  }
  
  public static void main(String[]args){
    Queue q = new Queue();
    
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.enqueue(4);
    
    while(q.isEmpty()!=true){
      System.out.println(q.peek());
      q.dequeue();
    }
    
  }
  
  
}
