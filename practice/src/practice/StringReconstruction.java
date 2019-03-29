
package practice;
import java.util.*;
public class StringReconstruction {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int maxcount=0;
   char a[]=new char[10000000];
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
    String subs=sc.next();
    int f=sc.nextInt();
    for(int j=0;j<f;j++){
    int p=sc.nextInt();
   
    for(int k=0;k<subs.length();k++){
    if(a[p-1] != subs.charAt(k)){
   a[p-1]=subs.charAt(k);
    }
    p++;
    maxcount=Math.max(p,maxcount);
    }
    }
    }
   for(int i=0;i<maxcount-1;i++){
       if(a[i]=='\u0000'){
     System.out.print('a');
   }
   else {
  System.out.print(a[i]);}}
    }
}
