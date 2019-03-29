package practice;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class The_artrful_expedient {
    public static void main(String[] args) throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());
    StringTokenizer st=new StringTokenizer(br.readLine());
    StringTokenizer t=new StringTokenizer(br.readLine());
        ArrayList a1=new ArrayList();
        ArrayList a2=new ArrayList();
    for(int i=0;i<n;i++){
    a1.add(Integer.parseInt(st.nextToken()));
    a2.add(Integer.parseInt(t.nextToken()));
    }
    
   
    int count=0;
    for (int i=0;i<n;i++){
    for(int j=0;j<n;j++){
    if(a1.contains((int)a1.get(i)^(int)a2.get(j)))
        count++;
    else if(a2.contains((int)a1.get(i)^(int)a2.get(j)))
        count++;
    }
    }
    if(count%2==0)
        System.out.println("Karen");
    else
        System.out.println("Koyomi");
    }
}
