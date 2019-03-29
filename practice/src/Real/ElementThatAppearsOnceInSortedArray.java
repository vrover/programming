/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Real;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 *
 * @author Public
 */
public class ElementThatAppearsOnceInSortedArray {
    void search(int a[],int l,int h){
    
    if(l==h){System.out.println(a[l]); return;}
    int mid=(l+h)/2;
    if(mid%2==0){
    if(a[mid]==a[mid-1])
        search(a,l,mid-2);
    else
        search(a,mid,h);
    }
    else if(mid%2!=0){
    if(a[mid]==a[mid+1])
        search(a,l,mid-1);
    else
        search(a,mid+1,h);
    }
    }
    public static void main(String[] args) throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int j=0;j<t;j++){
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a[]=new int[n];
        for(int i=0;i<n;i++){
        a[i]=Integer.parseInt(st.nextToken());
        }
        new ElementThatAppearsOnceInSortedArray().search(a, 0, n-1);
}
}
}
