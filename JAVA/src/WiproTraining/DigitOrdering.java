
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WiproTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Public
 */
public class DigitOrdering {
   
    public static void main(String[] args) {
        int n=5035400;
       	boolean neg=false;
        
        if(n<0) { neg=true;
        n=-n;}
        ArrayList<Integer> digits=new ArrayList();
        while(n!=0){
            if(n%10==0 && !neg){  
        }
            else{
                digits.add(n%10);}
        n=n/10;
        }

        
      
        if(neg==false){
        //	digits.sort(new DigitOrdering());
       // 	Collections.sort(digits,comp);
        Collections.sort(digits);
        //digits.sort(Comparator.naturalOrder());
        }
  
        else{
        	
        //	Collections.sort(digits,comp1);
        Collections.sort(digits, Collections.reverseOrder());
        //	digits.sort(Comparator.reverseOrder());
        	}
        String s="";
        for(int i:digits){
        s=s+i;
        }
        if(neg==false)
        System.out.println( Integer.parseInt(s));
        else
        System.out.println(-Integer.parseInt(s));
    }
}
