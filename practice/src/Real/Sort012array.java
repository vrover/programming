package Real;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Sort012array {
  public static void main(String[] args) throws Exception{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int t=Integer.parseInt(br.readLine());
      for(int j=0;j<t;j++){
      int n=Integer.parseInt(br.readLine());
    StringTokenizer st=new StringTokenizer(br.readLine());
          HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
          h.put(0,0);
          h.put(1,0);
          h.put(2,0);
          for(int i=0;i<n;i++){
              int num=Integer.parseInt(st.nextToken());
          if(num==0){
          h.put(0, (int)h.get(0)+1);
          }
          else if(num==1){
          h.put(1,(int)h.get(1)+1);
          }
          else if(num==2){
          h.put(2,(int)h.get(2)+1);
          }
          }
          int l=0,m=0,p=0;
          for( l=0;l<(int)h.get(0);l++){
          System.out.print(0+" ");
          }
      for( m=l;m<l+(int)h.get(1);m++){
          System.out.print(1+" ");
          }
      for( p=m;p<m+(int)h.get(2);p++){
          System.out.print(2+" ");
          }
      }
  }
}
