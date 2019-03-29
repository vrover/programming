/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Real;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *
 * @author Public
 */
public class PythagoreanTriplet {
     public static void main(String[] args) throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int t=Integer.parseInt(br.readLine());
      for(int j=0;j<t;j++){
      int n=Integer.parseInt(br.readLine());
    StringTokenizer st=new StringTokenizer(br.readLine());
    int a[]=new int[n];
    for(int i=0;i<n;i++){
    a[i]=Integer.parseInt(st.nextToken());
    a[i]=a[i]*a[i];
    }
    Arrays.sort(a);
    boolean flag=false;
    outer:  for(int i=n-1;i>=2;i--){
    int low=0;
    int high=i-1;
    while(low<high){
    if(a[low]+a[high]==a[i])
    {
    System.out.println("Yes");
    flag=true;
    break outer;
    }
    if(a[low]+a[high]<a[i])
        low++;
    else{
    high--;
    }
    }
    }
    if(!flag){System.out.println("No");}
      }
     }
}
