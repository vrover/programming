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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import javafx.util.Pair;

/**
 *
 * @author Public
 */
public class SortingElementsOfArrayByFrequency implements Comparator<Entry> {
    public int compare(Entry e1, Entry e2){
        Integer x1=(int)e1.getValue();
        Integer x2=(int)e2.getValue();
        return -x1.compareTo(x2);
    }
   
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int j=0;j<t;j++){
        int n=Integer.parseInt(br.readLine());
       TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int x=Integer.parseInt(st.nextToken());
        if(tm.containsKey(x)){
        tm.put(x, (int)tm.get(x)+1);
        }
        else
            tm.put(x,1);
        }
        //<Entry<Integer,Integer>> s=tm.entrySet();
        List<Entry<Integer,Integer>> l=new ArrayList<Entry<Integer,Integer>>(tm.entrySet());
       l.sort(new SortingElementsOfArrayByFrequency());
       for(Entry<Integer,Integer> e:l){
       int i=e.getValue();
       int y=e.getKey();
       while(i>0){
       System.out.print(y+" ");
       i--;
       }
       }
     System.out.println();
        }
    }

   
}
