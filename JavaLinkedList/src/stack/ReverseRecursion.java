
package stack;

import java.util.Scanner;
class Node{
int data;
Node next;
Node(int value){
data=value;
next=null;
}
}

public class ReverseRecursion {
       Node top=null;
   
    void push(int d){
   
    Node node=new Node(d);
   node.next=top;
   top=node;
    }
    void func(){
        int curr=top.data;
        
        pop();
        if(top!=null)
        func();
        push(curr);
    }
    
    void pop(){
    top=top.next;
    }
    void display(){
    Node current=top;
    while(current!=null){
    System.out.println(current.data);
    current=current.next;
    }
    }
    public static void main(String[] args){
    ReverseRecursion rr=new ReverseRecursion();
    rr.push(4);
    rr.push(3);
    rr.push(2);
    rr.push(1);
   
    rr.display();
rr.func();
rr.display();   
 }     
}
