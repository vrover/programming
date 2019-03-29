/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Real;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Shivi
 */
public class MaximumOfAllSubarraysOfSizeK {
    public static void main(String[] aregs) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int t=Integer.parseInt(br.readLine());
       for(int l=0;l<t;l++){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
           StringTokenizer st=new StringTokenizer(br.readLine());
           int ar[]=new int[n];
           for(int j=0;j<n;j++){
           ar[j]=Integer.parseInt(st.nextToken());
           }
           Deque<Integer> d=new LinkedList<Integer>();
           int i;
           for(i=0;i<k;i++)
           {
           while(!d.isEmpty() && ar[i]>=ar[d.peekLast()])
               d.removeLast();
           
           d.addLast(i);
           }
           for(;i<n;i++){
           System.out.print(ar[d.peek()]+" ");
               while(!d.isEmpty() && d.peekFirst()<=i-k)
               d.removeFirst();
               
               while(!d.isEmpty() && ar[i]>=ar[d.peekLast()])
                   d.removeLast();
               d.addLast(i);
           }
           System.out.print(ar[d.peek()]);
          
       }
    }
}
