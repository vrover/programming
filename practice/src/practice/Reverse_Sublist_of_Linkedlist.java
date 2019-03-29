/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 *
 * @author Public
 */
/*class node{
    int data;
    node next;
node(int d){
data=d;
next=null;
}
}*/
public class Reverse_Sublist_of_Linkedlist {
    public static void main(String[] args) throws Exception{
    LinkedList l=new LinkedList();
    l.add(10);
    l.add(20);
    l.add(30);
    l.add(40);
    l.add(50);
    l.add(60);
    l.add(70);
    System.out.println(l);
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int m=Integer.parseInt(br.readLine());
    int n=Integer.parseInt(br.readLine());
    for(int i=0;i<(n-m+1)/2;i++){
    int x=(int)l.get(m-1+i);
    l.set(m-1+i, l.get(n-1-i));
    l.set(n-1-i, x);
    }
    System.out.println(l);
    }
}
