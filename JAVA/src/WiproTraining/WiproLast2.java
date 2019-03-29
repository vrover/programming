/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WiproTraining;

import java.util.Arrays;

/**
 *
 * @author Public
 */
public class WiproLast2 {
     int findKey(int[] input1,int input2){
         int i=input1[0]/10;
         int a[] =new int[input2];
         a=Arrays.copyOf(input1, input2);
         Arrays.sort(a);
         if(a[0]>0){
         return a[0];
         }
         int count=input1[0]%10;
         boolean turn=false;
         while(input1[i]>0){
         int k=input1[i]%10;
         int next=input1[i]/10;
         //System.out.println(k+" "+next);
         if(turn==false){
         count+=k;
         turn=true;
         }
         else{
         count-=k;
         turn=false;
         } 
         i=next;
         }
     return count+(-input1[i]%10);
     }
    
    public static void main(String[] args) {
        int ar[]={47,65,51,17,29,-32};
       System.out.println( new WiproLast2().findKey(ar, 6));
    }
}
