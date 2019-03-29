
package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Public
 */
class test {
    static int p;
    static{
    p=77;
    }
    int a;
    int x=4;
    static int z=9;
    protected int y=9;
    static void fun(){
        
        test v=new test();
     v.x=9;
     System.out.println(v.x);
    
    }
    
    
    
    public static void main(String[] args){
        int a=2,b=5;
        System.out.println(a+b+" ");
        System.out.println(test.z);
        test.fun();
        
   int number=10;  
    switch(number){  
    case 10: System.out.println("10");  
    case 20: System.out.println("20"); 
     default:System.out.println("Not in 10, 20 or 30");
    case 30: System.out.println("30");  
     
    }  
    
    int x=4;
    int y=7;
    x=x^y^(y=x);
    System.out.println(x);
        System.out.println(y);
    }
}
