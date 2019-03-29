/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.*;
/**
 *
 * @author Public
 */
public class digitalTime {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[60];
    int ar[]=new int[10];
     
    int sh=sc.nextInt();
    int sm=sc.nextInt();
    int ss=sc.nextInt();
    int eh=sc.nextInt();
    int em=sc.nextInt();
    int es=sc.nextInt();
    for(int h=sh;h<=eh;h++){
        a[h]++;
    for(int m=sm;m<=em;m++){
        a[m]++;
    for(int s=ss;s<=es;s++){
    a[s]++;
    }
    }
    }
    if(sm==em)
        a[sm]++;
    if(sh==eh)
    a[sh]++;
    if(ss==es)
        a[ss]++;
    
     for(int i=0;i<=9;i++){
        
    if(a[i]!=0){
        ar[i]=ar[i]+a[i];
        ar[0]=a[0]+a[i];
        
    }
    }
    
    for(int i=10;i<=59;i++){
       
    if(a[i]!=0){
         int d1=i%10;
         
        int d2=i/10;
        ar[d1]=ar[d1]+a[i];
        
        ar[d2]=ar[d2]+a[i];
    }
    }
    
     for(int i=0;i<10;i++){
     System.out.print(ar[i]+" ");
     }
    }
}
