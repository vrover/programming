/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author Public
 */
public class halfAlphabetPyramid {
    public static void main(String[] args){
     //   int count=0;
    for(char i='A';i<='E';i++){
    for(int j=0;j<=Character.getNumericValue(i)-Character.getNumericValue('A');j++){
    System.out.print(i+" ");
    }
    //count++;
        System.out.println();
    }
    }
}
