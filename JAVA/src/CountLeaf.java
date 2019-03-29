/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Public
 */
public class CountLeaf {
    Node root;
    int c=0;
     void count(Node n){
    if(n==null)
        return;
        if(n.left==null && n.right==null)
            c++;
        else{
            count(n.left);
            count(n.right);}
    }
    
    
    public static void main(String[] args){
        CountLeaf v=new CountLeaf();
     v.root=new Node(1);
   v.root.left=new Node(2);
   v.root.right=new Node(3);
   v.root.left.left=new Node(4);
   v.root.left.right=new Node(5);
   v.count(v.root);
   System.out.println(v.c);
    }
}
