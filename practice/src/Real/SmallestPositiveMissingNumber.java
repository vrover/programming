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
 * @author Public
 */
public class SmallestPositiveMissingNumber {
     public static void main(String[] args) throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int t=Integer.parseInt(br.readLine());
      for(int j=0;j<t;j++){
      int n=Integer.parseInt(br.readLine());
    StringTokenizer st=new StringTokenizer(br.readLine());
    boolean a[]=new boolean[n+1];
    for(int i=1;i<n+1;i++){
    int x=Integer.parseInt(st.nextToken());
    if(x>0 && x<n+1){
    a[x]=true;
    }
    }
   int i=1;
   while(i<n+1 && a[i]){
   i++;
   }
   System.out.println(i);
    
    
      }
     }
}
