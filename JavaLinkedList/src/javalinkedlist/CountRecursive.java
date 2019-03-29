
package javalinkedlist;

import java.util.Scanner;

public class CountRecursive {
    Node start=null;
    Node current=null;
    Scanner sc=new Scanner(System.in);
    void insert_end(){
    System.out.println("enter data : ");
    int d=sc.nextInt();
    Node node=new Node(d);
    if(start==null){
    start=node;
    current=node;
    }
    else{
    current.next=node;
    current=node;
    }
    }
    int count(Node n){
    if(n==null)
        return 0;
    return 1+count(n.next);
    }
    public static void main(String[] args){
        CountRecursive c=new CountRecursive();
        c.insert_end();
        c.insert_end();
        c.insert_end();
        c.insert_end();
        c.insert_end();
        System.out.println(c.count(c.start));
    }
}
