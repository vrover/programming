/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WiproTraining;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.System.out;
/**
 *
 * @author Public
 */
public class NewClass5 {
    
    public static int func( int x ,int y,int z)
{
int p;
if ((p=x+y) < z)
return (x+y);
else
return (0);
 
}
    public static void main(String[] args) throws Exception{
        String aStr = "Hello";
String bStr = "Hello";
String cStr = new String("Hello");
String dStr = cStr;
out.println(aStr == bStr);
out.println(bStr == cStr);
out.println(cStr == dStr);
out.println(aStr.replace('H','H') == "Hello");
out.println( aStr.replace('H','h') == "hello");
out.println(aStr == "He"+"llo");
out.println( aStr.replace("H","H") == "Hello");
out.println( aStr.replace("H","h") == "hello");

System.out.println(func(2147483643,5,10));
System.out.println(func(20,5,10));

int count = 0;
for (int i = Integer.MAX_VALUE-100; i <= Integer.MAX_VALUE-1; i++)
count++;
System.out.println(count);


  //      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//int s=Integer.parseInt(br.readLine());

//out.println(Integer.toString(s,8));



    }
}
