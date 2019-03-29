/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Real;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Public
 */
public class NextGreaterNoSetsDigits {
    public static void main(String[] args) throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++){
    char a[]=br.readLine().toCharArray();
    int i=a.length-2;
    while(i>=0 && a[i]>=a[i+1]){i--;}
    if(i==-1){
    System.out.println("not possible");
    continue;
    }
    int l=0;
    for( l=a.length-1;l>i;l--)
    {
        if(a[l]>a[i])
        break;
    }
    char temp=a[l];
   a[l]=a[i];
   a[i]=temp;
   Arrays.sort(a, i+1, a.length);
   for(int k=0;k<a.length;k++){
   System.out.print(a[k]+"");
   }
   System.out.println();
    }
   
    }
    
}
