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
public class TrappingRainWater {
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
    int left[]=new int[n];
    int right[]=new int[n];
    left[0]=a[0];
    int water=0;
    for(int i=1;i<n;i++){
    left[i]=Math.max(left[i-1], a[i]);
    }
    right[n-1]=a[n-1];
    for(int i=n-2;i>=0;i--){
    right[i]=Math.max(right[i+1],a[i]);
    }
    
    for(int i=0;i<n;i++){
    water+=Math.min(left[i], right[i])-a[i];
    }
    System.out.println(water);
      }
    }
}
