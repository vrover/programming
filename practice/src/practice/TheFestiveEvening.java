
package practice;
import java.util.*;
public class TheFestiveEvening {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int g=sc.nextInt();
    String str=sc.next();
    char a[]=str.toCharArray();
    if(a.length==g){
    System.out.println("NO");
    return;
    }
    
    int count=0;
   
    HashMap<Character,Integer> h=new HashMap<Character,Integer>();
    for(int i=0;i<a.length;i++){
    if(h.containsKey(a[i])){
    h.put(a[i],h.get(a[i])+1);
    }
    else{
    h.put(a[i],1);
    count++;
    }
    }
    int ar[]=new int[256];
  int free=g;
    for(int i=0;i<a.length;i++){
    if(ar[a[i]]==0 && free==0){
    System.out.println("YES");
    return;
    }
    else if(ar[a[i]]==0 && free!=0){
    ar[a[i]]=1;
    free--;
    if(h.get(a[i])-1==0){
    h.remove(a[i]);
    free++;
    }
    else{h.put(a[i],h.get(a[i])-1);}
    }
    
    else if(ar[a[i]]!=0){
        if(h.get(a[i])-1==0){
    h.remove(a[i]);
    free++;
    }
        else{
    h.put(a[i],h.get(a[i])-1);
    }
    }
    }
    System.out.println("NO");
}
}
