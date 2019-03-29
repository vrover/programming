
public class AllPaths {
    Node root;
    int path[]=new int[100];
    void findpath(Node node,int path[],int pathlen){
    if(node==null)
        return;
    path[pathlen]=node.data;
    pathlen++;
    if(node.left==null && node.right==null){
    print(path,pathlen);}
    else{
    findpath(node.left,path,pathlen);
    findpath(node.right,path,pathlen);
    }
    }
void print(int path[],int pathlen){
for(int i=0;i<pathlen;i++){
    System.out.print(path[i]+" ");
    
}
System.out.println("");
}    
    
    
    
    public static void main(String[] args){
    AllPaths v=new AllPaths();
    v.root=new Node(1);
   v.root.left=new Node(2);
   v.root.right=new Node(3);
   v.root.left.left=new Node(4);
   v.root.left.right=new Node(5);
    v.findpath(v.root, v.path, 0);
    }
}
