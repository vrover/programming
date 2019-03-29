/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.*;
import java.io.*;
public class Card_sorting {
    public static void main(String[] args) throws IOException{
    //Scanner sc=new Scanner(System.in);
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());
    Queue q=new ArrayDeque();
   TreeMap<Integer,Integer> t=new TreeMap<Integer,Integer>();
  StringTokenizer st=new StringTokenizer(br.readLine());
   for(int i=0;i<n;i++){
    int p=Integer.parseInt(st.nextToken());
    if(t.containsKey(p)){
     t.put(p,(Integer)((int)t.get(p)+1));}
     else{
     t.put(p,1);
     }
     q.add(p);
     
    }
   
  int count=0;
 
   while(!q.isEmpty()){
int a=(int)q.peek();
   int b=(int)t.firstKey();
   int c=(int)t.get(b);
   if(a==b && c!=0){
       t.put(b,c-1);
       if(c-1==0){
       t.remove(b);
       }
   count++;
   q.poll();
    
   }
  else if(a>b){
   q.add(q.poll());
   count++;}
   
}
   System.out.println(count);
}}
