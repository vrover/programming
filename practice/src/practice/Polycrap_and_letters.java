
package practice;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Polycrap_and_letters {
    public static void main(String[] args) throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int x=Integer.parseInt(br.readLine());
    char c[]=(br.readLine()).toCharArray();
    ArrayList al=new ArrayList();
    int count=0;
    for(int i=0;i<c.length;i++){
    if(c[i]>='a' && c[i]<='z'){
        int j=i;
        int innercount=0;
    while(j<c.length && (c[j]>='a' && c[j]<='z') ){
    if(!al.contains(c[j])){
    innercount++;
    al.add(c[j]);
    }
    j++;
    }
    if(innercount>count)
        count=innercount;
    al.clear();
    }
    }
    System.out.println(count);
    }
}
