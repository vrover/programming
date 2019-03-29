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
public class PrintAllSubsets {
    public static void main(String args[]) throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s=br.readLine();
    int n=s.length();
    for(int i=0;i<(1<<n);i++){
    for(int j=0;j<n;j++){
    if((i&(1<<j))>0){
    System.out.print(s.charAt(j)+" ");
    }
    
    }
    System.out.println();
    }
    }
}
