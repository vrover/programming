/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Real;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;

/**
 *
 * @author Public
 */
public class NextLargestElement {
     public static void main(String[] args) throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int t=Integer.parseInt(br.readLine());
      for(int j=0;j<t;j++){
      int n=Integer.parseInt(br.readLine());
    StringTokenizer st=new StringTokenizer(br.readLine());
    int a[]=new int[n];
    for(int i=0;i<n;i++){
    a[i]=Integer.parseInt(st.nextToken());
   
    }
    Stack<Integer> s=new Stack();
    Stack<Integer> r=new Stack();
    s.push(-1);
    
    
    for(int i=n-1;i>0;i--){
    while((int)s.peek()!=-1 && a[i]>(int)s.peek()){
    s.pop();
    }
    r.push(s.peek());
    if(a[i]>a[i-1])
        s.push(a[i]);
    }
    r.push(s.peek());
    while(!r.isEmpty()){
    System.out.print(r.pop()+" ");
    }
    System.out.println();
      }
     }
     
}
