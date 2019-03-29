/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 *
 * @author Public
 */
public class TwoCakes {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int p=Integer.parseInt(st.nextToken());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int max=Math.max(a, b);
        int min=Math.min(a, b);
        
        if(p==2){System.out.println(min); return;}
       // int pr[]=new int[p];
        //pr[0]=min;
        if(p==(a+b)){System.out.println(1); return;}
   int n=min;
        int m=max/(p-1);
      /*  for(int i=1;i<p-1;i++){
            pr[i]=x;
        }
        pr[p-1]=max-(x*(p-2));*/
        
         if(n<m){
    System.out.println(n);
             return;}
         
         int j=1;
        int count=n;
         while(j<p-1 && m<n){
             count=m;
         m=max/(p-1-j);
         n=min/(j+1);
         
         j++;
         }
       
         System.out.println(Math.max(Math.min(m,n),count));
    }
   
}
