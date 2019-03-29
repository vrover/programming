package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class OkabeAndBoxes {
    public static void main(String[] a) throws IOException{
    Scanner sc=new Scanner(System.in);    
    int n=sc.nextInt();
    int count=0;
    int c=1;
    Stack st=new Stack();    
    for(int i=0;i<2*n;i++){
         InputStreamReader r=new InputStreamReader(System.in);    
     BufferedReader br=new BufferedReader(r);
    String str=br.readLine();
    if(str.startsWith("a")){
    st.push(Character.getNumericValue(str.charAt(str.length()-1)));    
    }
    else{
    if((int)st.peek()!=c){
        st.sort(Comparator.reverseOrder());
        count=count+1;      
    }
    c++;
    st.pop();
    }
    }
    System.out.println(count);
    }
    }

