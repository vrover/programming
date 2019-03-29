/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Public
 */
import java.util.*;
public class DownloadFile {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
        int cost=0;
    int n=sc.nextInt();
    int k=sc.nextInt();
    for(int j=0;j<n;j++){
    int ti=sc.nextInt();
    int di=sc.nextInt();
    if(k!=0){
    if((k-ti)>=0){
    k=k-ti;
    ti=0;
    }
    else{
    
    ti=ti-k;
    k=0;
    }
    }
    cost=cost+(di*ti);
    }
    System.out.println(cost);
    }
    }
}
