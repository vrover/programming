/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.Implementation;

import java.io.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author Public
 */
public class A216 {
    static int sum=0;
     public static void main(String[] args) throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st=new StringTokenizer(br.readLine());
    int a=Integer.parseInt(st.nextToken());
    int b=Integer.parseInt(st.nextToken());
    int c=Integer.parseInt(st.nextToken());
    System.out.println(b*c+(a-1)*(b+c-1));
  /* int x=a;
   while(x<a+b-1){
   sum=sum+2*x;
   x++;
   }
   
   int n=b+c-1;
   
   if(n%2==0)
       sum=sum+x+x;
  // System.out.println(((n)*(2*a+b-1))/2);
   else
       sum=sum+x;
   System.out.println(sum);
      // System.out.println(((n)*(2*a+b-2))/2+a+b-1);
  /*  class calculate{
    void c(int a,int b,int c){
    if(a==1 && b==1 && c==1){
    sum=sum+1;
    System.out.println(sum);
    return;
    }
    sum=sum+((a+b+c)*2-6);
    if(a==1 || b==1 || c==1){
    System.out.println(sum);
    return;
    }
    c(a-1,b-1,c-1);
    
    }
    }
    new calculate().c(a, b, c);*/
   // System.out.println((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))*2);
     }
}
