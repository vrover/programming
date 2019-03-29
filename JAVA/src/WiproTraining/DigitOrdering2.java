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
public class DigitOrdering2 {
    public static void main(String[] args) {
        int n=-598032880;
        int freq[]=new int[10];
        boolean neg=false;
        if(n<0){ neg=true;
        n=-n;}
        while(n!=0){
        freq[n%10]+=1;
        n=n/10;
        }
       
        StringBuilder s=new StringBuilder();
       
        if(neg==false){
        for(int i=1;i<10;i++){
            if(freq[i]!=0)
            for(int j=0;j<freq[i];j++)
             s.append(i);
        }
          System.out.println(Integer.parseInt(s.toString()));
        }
        
        else{
            for(int i=9;i>=0;i--){
                if(freq[i]!=0)
            for(int j=0;j<freq[i];j++)
           s.append(i);
        }
              System.out.println(-Integer.parseInt(s.toString()));
        }
      
    }
}
