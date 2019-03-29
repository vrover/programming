
package javalinkedlist;

import java.util.LinkedList;
import java.util.Scanner;
class Node{
int data;
Node next;
Node(int value){
data=value;
next=null;
}
}
public class Intersection {
    
    	Node start=null;
	Node current=null;
	Scanner sc=new Scanner(System.in);
	void insertEnd(){
		System.out.println("enter data:");
		
        int a=sc.nextInt();
		Node node=new Node(a);
		if(start==null){
			start=node;
			current=node;
		}
		
		else{
			current.next=node;
			current=node;
		}
    }
        void display(){
			current=start;
			while(current.next!=null){
				System.out.print(current.data+"->");
				current=current.next;
			}
			System.out.println(current.data);
		}
        
        public static void main(String[] args){
        Intersection l1=new Intersection();
        Intersection l2=new Intersection();
        l1.insertEnd();
        l1.insertEnd();
        l2.insertEnd();
        l2.insertEnd();
        l2.insertEnd();
        l2.insertEnd();
        l1.current.next=l2.current;
        l2.insertEnd();
        l2.insertEnd();
        l2.insertEnd();
        l1.display();
        l2.display();
        l1.current=l1.start;
        l2.current=l2.start;
        l2.current=l2.current.next;
        int count=0;
        while(l2.current!=l1.current){
        l2.current=l2.current.next;
        l1.current=l1.current.next;
        count++;
        }
        System.out.println(count+" index of first linked list");
        }
}
