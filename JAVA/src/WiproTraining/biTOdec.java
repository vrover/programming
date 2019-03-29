/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WiproTraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Public
 */
public class biTOdec {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
        a[i]=Integer.parseInt(st.nextToken());
        b[i]=a[i];
        }
        int x=Integer.parseInt(br.readLine());
        for(int i=0;i<n-1;++i)
            for(int j=0;j<n-1-i;++j)
                if(a[j]>a[j+1]){
                int t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
                }
        for(int i=x+1;i<n;i++){
        System.out.println( a[i]);
                }
        int dec=Integer.parseInt(br.readLine(),2);
        System.out.println(dec);
    }
}
