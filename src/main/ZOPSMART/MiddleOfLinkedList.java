import java.util.*;

class LL{
  Node head;
  class Node{
    int data;
    Node next;

    Node(){
      this.data=data;
      this.next=null;
    }
  }
  public void addfirst(int data){
    Node newnode = new Node(data);
    if(head==null){
      head = newnode;
      return;
      
    }
    newnode.next = head;
    head=newnode;
  }
  public void addlast(int data){
    if(head==null){
      head=newNode;
      return;
    }
    Node curr = head;
    while(curr.next!=null){
      curr=curr.next;
      
    }
    curr.next=newNode;
  }
  public void printlist(){
    if(head==null){
      System.out.println("Empty");
    }
    Node curr = head;
    while(curr!=null){
      System.out.print(curr.data+" ");
      curr = curr.next;
    }
    
  }
  public void deletefirst(){
    if(head==null){
      System.out.print("Empty")
      return;
    }
    head=head.next;
  }
  public void deletelast(){
    if(head==null){
      System.out.print("Empty");
      return;
    }
    if(head.next==null){
      head = null;
      return;
    }
    Node secondlast = head;
    Node last = head.next;
    while(secondlast!=null){
      last = last.next;
      secondlast = secondlast.next;
    }
    secondlast.next = null;
  }
  
  public static void main(String[] args){
    
  }
}