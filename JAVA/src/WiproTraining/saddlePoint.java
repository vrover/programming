/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WiproTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Public
 */
public class saddlePoint {
    public static void main(String[] args) {
        int a[][]={{0,1,1,1,2},{8,9,11,12,3},{10,11,12,13,4},{22,23,24,25,5},{26,27,28,29,10}};
        int row[]=new int[5];
        int col[]=new int[5];
        for(int i=0;i<5;i++){
         
        row[i]=Arrays.stream(a[i]).max().getAsInt();
        col[i]=a[0][i];
        }

        for(int i=0;i<5;i++)
          for(int j=0;j<5;j++){
            if(a[i][j]<col[j]){col[j]=a[i][j];}
        }
         for(int i=0;i<5;i++)
          for(int j=0;j<5;j++){
            if(a[i][j]==col[j] && a[i][j]==row[i]){System.out.println(i+" "+j);}
        }
        
    }
}
