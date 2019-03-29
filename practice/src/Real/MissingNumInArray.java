/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Real;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Shivi
 */
public class MissingNumInArray {
    public static void main(String[] a) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int sum=n*(n+1)/2;
        int s=0;
        while(st.hasMoreTokens()){
        s=s+Integer.parseInt(st.nextToken());
        }
        System.out.println(sum-s);
        }
    }
}
