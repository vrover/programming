/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WiproTraining;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Public
 */
public class VoteEligibility {
    
    public static void main(String args[]) throws Exception{
       
      Scanner sc=new Scanner(System.in);
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
      int n=Integer.parseInt(br.readLine());
      String s[]=new String[n];
      
      for(int i=0;i<n;i++)
       {
       	 s[i]=br.readLine();
       }
       if(kape1.validateNumber(s)==0)
       System.out.print("invalid");
       else
       System.out.print("valid");
       
    }
}
class kape1 {

public static int validateNumber(String a[])


	{
		 int check=1;
      for(int i=0;i<a.length;i++)
       {
       
       	try{
       		double d=Double.parseDouble(a[i]);
       	}
       	catch(NumberFormatException e){ check=0;}
       	
       }
       
		return check;
		
	}
}