/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WiproTraining;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Public
 */
public class FindTheSum {
    public static void main(String[] args) throws FileNotFoundException {
        File f=new File("find_the_sum.txt");
        BufferedReader br=new BufferedReader(new FileReader(f));
        int sum=0;
        while(true){
            try {
                StringTokenizer st=new StringTokenizer( br.readLine());
                while(st.hasMoreTokens()){
                    try{
                sum+=Double.parseDouble(st.nextToken().replaceAll("[^0-9\\.]+", ""));
                    }
                    catch(Exception e){
                    
                    }
                }
            } catch (Exception ex) {
               break;
            }
        }
      String a = "jkjmk255hdfjn";
System.out.println(sum);
String b = a.replaceAll("[^0-9\\.]+", "");
System.out.println(Double.parseDouble(b));  
    }
    
}
