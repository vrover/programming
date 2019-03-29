 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Public
 */
public class NewYearTransportation {
     public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
      int n=Integer.parseInt(st.nextToken());
      int t=Integer.parseInt(st.nextToken());
      StringTokenizer st1=new StringTokenizer(br.readLine());
      int a[]=new int[n];
      for(int i=1;i<n;i++)
          a[i]=Integer.parseInt(st1.nextToken());
      for(int i=1;i<n;){
      i=i+a[i];
      if(i>t){break;}
      else if(i==t){System.out.println("YES"); return;}
      }
      System.out.println("NO");
     }
}
