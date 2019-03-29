/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *
 * @author Public
 */
public class BerSUball {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
        int b=Integer.parseInt(br.readLine());
        StringTokenizer st1=new StringTokenizer(br.readLine());
        int ba[]=new int[b];
        for(int i=0;i<b;i++){
        ba[i]=Integer.parseInt(st1.nextToken());
        }
        
          int g=Integer.parseInt(br.readLine());
        StringTokenizer st2=new StringTokenizer(br.readLine());
        int ga[]=new int[g];
        for(int i=0;i<g;i++){
        ga[i]=Integer.parseInt(st2.nextToken());
        }
        
        Arrays.sort(ba);
        Arrays.sort(ga);
  
        int bi=0,gi=0;
        int count=0;
       while(bi<b && gi<g){
       if(ba[bi]-ga[gi]==-1 || ba[bi]-ga[gi]==0 || ba[bi]-ga[gi]==1){
       bi++;
       gi++;
       count++;
       }
       else if(ba[bi]-ga[gi]<-1)
           bi++;
       else if(ba[bi]-ga[gi]>1)
           gi++;
       }
        System.out.println(count);
    }
}
