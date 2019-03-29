
package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Distances_to_zero {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   // HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
   int d[]=new int[n]; 
   ArrayList a=new ArrayList();
           
for(int i=0;i<n;i++){
a.add(sc.nextInt());
}
Object ar[]=a.toArray(); 
int f=(int)a.get(0);
int b=(int)a.get(n-1);
int in=(int)a.indexOf(0);
if(f!=0){
for(int k=0;k<in;k++){
    d[k]=in-k;
}
}
while(in!=a.lastIndexOf(0)){
int j=in+1;
while((int)ar[j]!=0){
j++;
}
int mid=(in+j)/2;
int z=0;
d[in]=0;
for(int v=in+1;v<=mid;v++){
d[v]=++z;
}
for(int v=mid+1;v<j;v++){
d[v]=z--;
}
ar[j]=0;
in=j;
}
int in2=(int)a.lastIndexOf(0);
if(b!=0){
    int l=0;
for(int k=in+1;k<a.size();k++){
    d[k]=++l;
}
}
/*if(f!=0){
for(int k=0;k<(int)a.indexOf(0);k++){
   a.remove(k);
}
}
if(b!=0){
for(int k=(int)a.lastIndexOf(0)+1;k<a.size();k++){
   a.remove(k);
}
}*/
/*a.remove(0);
int next=a.indexOf(0)+1;
a.add(0, 0);
int mid=(0+next)/2;
for(int v=1;v<=mid;v++){

}
*/
for(int i=0;i<n;i++){
System.out.print(d[i]+" ");
}
}
}
