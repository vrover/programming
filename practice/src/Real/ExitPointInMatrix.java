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
public class ExitPointInMatrix {
     public static void main(String[] args) throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int t=Integer.parseInt(br.readLine());
      for(int j=0;j<t;j++){
     StringTokenizer s1=new StringTokenizer(br.readLine());
     int n=Integer.parseInt(s1.nextToken());
     int m=Integer.parseInt(s1.nextToken());
     
    StringTokenizer st=new StringTokenizer(br.readLine());
    int a[][]=new int[n][m];
    for(int i=0;i<n;i++){
    for(int l=0;l<m;l++){
    a[i][l]=Integer.parseInt(st.nextToken());
    }
    }
    
    int ar[]={0,1,2,3};
    int r=0,c=0,i=0;
    while(true){
        
           if(a[r][c]==0){
   if(r==0 && ar[i]==3){
    break;
    }
    else if(c==0 && ar[i]==2){
    break;
    }
    else if(r==n-1 && ar[i]==1){
    break;
    }
    else if(c==m-1 && ar[i]==0){
    break;
    }
    

     //  System.out.println(r+" "+c); 
        
    }
        
        
    if(a[r][c]==0){
    switch(ar[i]){
    
        case 0:
            c++;
            break;
        case 1:
            r++; break;
        case 2:
            c--;
            break;
        case 3:
            r--;
            break;
    }
   
    }
    else{
        i=(i+1)%4;
        a[r][c]=0;
    switch(ar[i]){
        case 0:
            c++;
            break;
        case 1:
            r++; break;
        case 2:
            c--;
            break;
        case 3:
            r--;
            break;
    }
    }
    
     }
    System.out.println(r+" "+c); 
      }
     }
}
