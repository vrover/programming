/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Real;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;
import javafx.util.Pair;

/**
 *
 * @author Shivi
 */
public class MinimumPlatforms implements Comparator<Pair> {
    public int compare(Pair p1,Pair p2){
    Integer t1=(Integer)p1.getKey();
    Integer t2=(Integer)p2.getKey();
    return t1.compareTo(t2);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int k=0;k<t;k++){
            int train=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            StringTokenizer s=new StringTokenizer(br.readLine());
            ArrayList<Pair<Integer,Character>> al=new ArrayList();
            for(int j=0;j<train;j++){
            al.add(new Pair(Integer.parseInt(st.nextToken()),'A'));
            al.add(new Pair(Integer.parseInt(s.nextToken()),'D'));
            }
            al.sort(new MinimumPlatforms());
            int acount=0,dcount=0;
            int plat=0;
            for(Pair p:al){
            if((char)p.getValue()=='A')
                acount++;
            else{dcount++;}
            plat=Math.max(plat,acount-dcount);
            }
            System.out.println(plat);
        }
    }
}
