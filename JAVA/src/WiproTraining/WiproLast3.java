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
public class WiproLast3 {
    int The555Decoder(int[] input1,int input2){
        StringBuilder s=new StringBuilder("");
    for(int i=0;i<input2;i++){
        if(input1[i]>999 || input1[i]<100){
        input1[i]=0;
        continue;
        }
        s=new StringBuilder("");
    while(input1[i]!=0){
        int d=input1[i]%10;
        d=Math.abs(5-d);
    s.append(d);
    input1[i]=input1[i]/10;
    }
    String str=s.reverse().toString();
    int n=Integer.parseInt(str);
    int sum=0;
     if (n == 0) 
       sum= 0;
        sum= (n % 9 == 0) ? 9 : (n % 9);
        input1[i]=sum;
    }
    int r=0;
    for(int i=0;i<input2;i++){
    r=r+input1[i];
    }
    return r;
    }
    public static void main(String[] args) {
    int[] ar={100,1,839,1836,610,757};
        System.out.println(new WiproLast3().The555Decoder(ar, 6));
    }
}
