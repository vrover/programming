/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WiproTraining;

/**
 *
 * @author Public
 */
public class SumAndAvgOfInputs {
    
public static void main(String[] args) {
	if(args.length==0) {System.out.print("NO INPUT"); return;}
	else {
		int n=0;
		try {
		n=Integer.parseInt(args[0]);
		}
		catch(Exception e) {
		System.out.println("FIRST ARGUMENT SHOULD BE INT");
		return;
	}
		if(n<1) {System.out.println("FIRST ARGUMENT SHOULD BE>0"); return;}
		if(args.length<n+1) {System.out.println("INSUFFICIENT INPUTS"); return;}
		double sum=0;
		int num=0;
		int nonnum=0;
		for(int i=1;i<=n;i++) {
			try {
				
				Double.parseDouble(args[i]); num++;}
			catch(Exception e) {nonnum++; continue;}
			sum=sum+Double.parseDouble(args[i]);
		}
		System.out.println("THE SUM IS "+sum);
		System.out.println("THE AVERAGE IS "+(sum/num));
		System.out.println("NUMERICAL INPUTS "+num);
		System.out.println("NON NUMERICAL INPUTS"+nonnum);
}

}}
