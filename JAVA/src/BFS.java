
import java.util.LinkedList;
import java.util.Queue;
class Node{
int data;
Node left,right;
Node(int value){
    data=value;
left=right=null;
}
}
public class BFS {
    Node root;
    
    void traverse(){
   Queue<Node> q=new LinkedList<Node>();
   q.add(root);
   
   while(!q.isEmpty()){
       Node temp= q.poll();
       System.out.print(temp.data+"  ");
       if(temp.left!=null){
       q.add(temp.left);
       }
          if(temp.right!=null){
       q.add(temp.right);
       } 
    }
  }
    
   public static void main(String[] args){
   BFS v=new BFS();
   v.root=new Node(1);
   v.root.left=new Node(2);
   v.root.right=new Node(3);
   v.root.left.left=new Node(4);
   v.root.right.right=new Node(5);
   v.traverse();
   }
}
