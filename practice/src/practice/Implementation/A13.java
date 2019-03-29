/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Public
 */
public class A13 {
     public static void main(String[] args) throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int a=Integer.parseInt(br.readLine());
    int sum=0;
    for(int i=2;i<=a-1;i++){
    
    int x=a;
    while(x!=0){
    sum=sum+(x%i);
    x=x/i;
    }
    }
    
    int min=Math.min(sum,a-2);
    for(int i=min;i>0;--i){
    if(sum%i==0 && (a-2)%i==0)
    {
    System.out.println(sum/i+"/"+((a-2)/i));
    return;
    }
    }
    
     }
}
