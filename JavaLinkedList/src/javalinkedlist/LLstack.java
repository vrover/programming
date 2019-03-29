
package javalinkedlist;

import java.util.Scanner;

public class LLstack {
    Node top=null;
    Node temp=null;
    Scanner sc=new Scanner(System.in);
    void push(){
    System.out.print("enter data : ");
    int a=sc.nextInt();
    Node node=new Node(a);
   node.next=top;
   top=node;
    }
    
    void pop(){
    temp=top;
    top=top.next;
    temp=null;
    }
    void display(){
    Node current=top;
    while(current!=null){
    System.out.println(current.data);
    current=current.next;
    }
    }
    public static void main(String[] args){
    LLstack st=new LLstack();
    st.push();
    st.push();
    st.push();
    st.push();
    st.push();
    st.push();
    st.display();
st.pop();
st.pop();
st.display();    }
    
    
    
}
