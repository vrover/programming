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
 * @author Public
 */
public class ReverseAyyarInGroups {
    public static void main(String[] args) throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int k=0;k<t;k++){
    int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a[]=new int[n];
        for(int i=0;i<n;i++){
        a[i]=Integer.parseInt(st.nextToken());
        }
        int g=Integer.parseInt(br.readLine());
        if(g>n){g=n;}
        int s=-g,e=-1;
        for(int l=0;l<n/g;l++){
            s+=g;
            e+=g;
        for(int j=e;j>=s;j--){System.out.print(a[j]+" ");}
        }
        if(a.length!=e+1){
        for(int m=a.length-1;m>e;m--){System.out.print(a[m]+" ");}
        }
        System.out.println();
    }
    }
}
