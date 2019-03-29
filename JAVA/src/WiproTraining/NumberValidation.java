/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WiproTraining;

/**
 *
 * @author Public
 */
public class NumberValidation {
    public static void main(String[] args) {
        String s="458-126-1654";
        char a[]=s.toCharArray();
        for(int i=0;i<12;i++){
        if((i!=7 || i!=3) && !Character.isDigit(s.charAt(i))){}
        else if((i==3 || i==7) && s.charAt(i)=='-')
        }
        if(a[3]=='-' && a[7]=='-'){
            System.out.println("1");
        }
    }
}
