/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Real;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Shivi
 */
public class SubArrayWithGivenSum {
     public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int t=Integer.parseInt(br.readLine());
        for(int j=0;j<t;j++){
            StringTokenizer str=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(str.nextToken());
            int s=Integer.parseInt(str.nextToken());
        int a[]=new int[n];
    
         StringTokenizer st=new StringTokenizer(br.readLine());
    for(int i=0;i<n;i++){
    a[i]=Integer.parseInt(st.nextToken());
    
    }
    
    
    int sum=0;
    int start=0;
    int end=0;
    for(int i=0;i<n;i++){
     if(a[i]>s){
     start=end=i+1;
     sum=0;
     }   
   else if(sum+a[i]<=s){
    sum+=a[i];
    end=i;
    }
    
    else if(sum+a[i]>s){
    while(sum+a[i]>s){
    sum-=a[start];
    start++;
    }
    sum+=a[i];
    end=i;
    }
     if(sum==s){
     System.out.println((start+1)+" "+(end+1));
     break;
     }
    }
    
        
        }
     }
}
