/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javafx.util.Pair;

/**
 *
 * @author Public
 */
public class B510 {
    static int row;
    static int column;
    static int x;
    static int y;
    static int px;
    static int py;
  static void fun(boolean b){
        if(b==true){
       System.exit(0);
        }
        }
        public static void main(String[] args) throws Exception{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int r=Integer.parseInt(st.nextToken());
        int c=Integer.parseInt(st.nextToken());
        row=r;
        column=c;
        char a[][]=new char[r][c];
        boolean visited[][]=new boolean[r][c];
        for(int i=0;i<r;i++){
        String s=br.readLine();
        for(int j=0;j<c;j++){
        a[i][j]=s.charAt(j);
        }
        }
        ArrayList<Pair<Integer,Integer>> exploring=new ArrayList<Pair<Integer,Integer>>();
class dfs{          
  void DFS(char a[][],int i,int j,boolean v[][]){
     char ch=a[i][j];
     v[i][j]=true;
     if(j+1<column && a[i][j+1]==ch && v[i][j+1]==false ){
         x=i;
         y=j+1;
         px=i;py=j;
         exploring.add(new Pair(x,y));
  DFS(a,i,j+1,v);
  }
     if(i+1<row && a[i+1][j]==ch && v[i+1][j]==false){
      x=i+1;
      y=j;
      px=i;py=j;
      exploring.add(new Pair(x,y));
         DFS(a,i+1,j,v);
     }
   if(i-1>=0 && a[i-1][j]==ch && v[i-1][j]==false){
      x=i-1;
      y=j;
      px=i;py=j;
      exploring.add(new Pair(x,y));
         DFS(a,i-1,j,v);
     }
    if(j-1>=0 && a[i][j-1]==ch && v[i][j-1]==false){
      px=i;py=j;
      x=i;
      y=j-1;
      exploring.add(new Pair(x,y));
         DFS(a,i,j-1,v);
     }
    else{
  if(exploring.contains(new Pair(px,py)))
exploring.remove(new Pair(px,py));
  if(exploring.contains(new Pair(x+1,y)) || exploring.contains(new Pair(x-1,y)) || exploring.contains(new Pair(x,y-1)) || exploring.contains(new Pair(x,y+1)))
{System.out.println("Yes"); 
fun(true);
}
  exploring.add(new Pair(px,py));
  }
  
  }
 }

outer: for(int m=0;m<r;m++){
for(int n=0;n<c;n++){
if(visited[m][n]==false){
    exploring.add(new Pair(m,n));
new dfs().DFS(a,m,n, visited);
/*System.out.println(px);
System.out.println(px);
System.out.println(exploring);
*/

px=-4;
py=-4;
x=-5;
y=-5;
exploring.clear();
}
}
}
System.out.println("No");


        }
}
