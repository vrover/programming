/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Public
 */

public class TreeSize {
    Node root;
int count=0;
    void size(Node n){
    if (n==null)
        return;
    count++;
    
    
        size(n.left);
        size(n.right);
    
    }
    public static void main(String[] args){
   TreeSize v=new TreeSize();
   v.root=new Node(1);
   v.root.left=new Node(2);
   v.root.right=new Node(3);
  // v.root.left.left=new Node(4);
   v.root.right.right=new Node(5);
   v.size(v.root);
   System.out.println(v.count);
   
    }
}
