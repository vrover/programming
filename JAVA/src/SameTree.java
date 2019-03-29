/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Public
 */
public class SameTree {
    Node root1,root2;
   int check(Node n1,Node n2){
       if(n1==null && n2==null)
           return 1;
   if(n1.data==n2.data){
   check(n1.left,n2.left);
   check(n1.right,n2.right);
   return 1;}
       return 0;
   }
   public static void main(String[] args){
   SameTree v=new SameTree();
      v.root1=new Node(1);
   v.root1.left=new Node(2);
   v.root1.right=new Node(3);
   v.root1.left.left=new Node(4);
   v.root1.right.right=new Node(5);
   
      v.root2=new Node(1);
   v.root2.left=new Node(2);
   v.root2.right=new Node(3);
   v.root2.left.left=new Node(4);
   //v.root2.right.right=new Node(5);
   if(v.check(v.root1,v.root2)==1){
   System.out.println("identical");}
   }
}
