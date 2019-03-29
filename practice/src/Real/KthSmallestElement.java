/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Real;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *
 * @author Public
 */
public class KthSmallestElement {
 /*  public int compare(Object o1,Object o2){
   Integer i1=(Integer)o1;
   Integer i2=(Integer)o2;
   return -i1.compareTo(i2);
   }*/
   public static void main(String[] args) throws Exception{
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int t=Integer.parseInt(br.readLine());
      for(int j=0;j<t;j++){
      int n=Integer.parseInt(br.readLine());
     
    StringTokenizer st=new StringTokenizer(br.readLine());
    int e=Integer.parseInt(br.readLine());
    TreeSet<Integer> ts=new TreeSet<Integer>();
    for(int i=0;i<n;i++){
    ts.add(Integer.parseInt(st.nextToken()));
    }
    int k=0;
    int element=-1;
   
    for(Integer i:ts){
     k++;
    element=i;
    if(k==e){
    break;
    }
       
    }
    System.out.println(element);
      }
   }
}
