/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Real;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Public
 */
public class CheckIfStringRotatedBy2Places {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int j=0;j<t;j++){
        String a=br.readLine();
        String b=br.readLine();
        StringBuilder aa=new StringBuilder(a);
       
        aa.append(aa.charAt(0));
        aa.append(aa.charAt(1));
        aa.delete(0, 2);
       
        
         StringBuilder ca=new StringBuilder(a);
         
         
        ca.insert(0,ca.charAt(ca.length()-1));
        ca.insert(0,ca.charAt(ca.length()-2));
        ca.delete(ca.length()-2, ca.length());
        
        if(ca.toString().equals(b) || aa.toString().equals(b))
            System.out.println(1);
        else
            System.out.println(0);
        }
    }
}
