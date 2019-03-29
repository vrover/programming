/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPackage;

import java.util.Scanner;

 class Node{
 int data;
 Node left;
 Node right;
 Node(int value){
 data=value;
 left=right=null;
 }
 }
class LinkedList {
    Node root=null;
    
    
    void inorder(Node n){
        if(n==null){
        return;}
        else{
    inorder(n.left);
    System.out.print(n.data+" ");
    inorder(n.right);}
    }
   
    
    
    public static void main(String[] args){
    LinkedList ll=new LinkedList();
    ll.root=new Node(1);
    ll.root.left=new Node(2);
    ll.root.right=new Node(3);
    ll.root.left.left=new Node(4);
    ll.inorder(ll.root);
    }
}

