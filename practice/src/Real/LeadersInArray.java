/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Real;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
 * @author Shivi
 */
public class LeadersInArray {
     public static void main(String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   int t=Integer.parseInt(br.readLine());
   for(int k=0;k<t;k++){
    int n=Integer.parseInt(br.readLine());
    int a[]=new int[n];
         StringTokenizer st=new StringTokenizer(br.readLine());
    for(int i=0;i<n;i++){
    a[i]=Integer.parseInt(st.nextToken());
    }
    int max=a[n-1];
     Stack<Integer> s=new Stack();
     s.push(a[n-1]);
    for(int i=n-1;i>=0;i--){
    if(a[i]>max){
       max=a[i];
    s.push(a[i]);
    }
    }
    while(!s.empty()){
    System.out.print((int)s.pop()+" ");
    }
    System.out.println();
   }
     }
}
