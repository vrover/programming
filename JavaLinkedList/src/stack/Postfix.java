
package stack;

import java.util.Scanner;
import java.util.Stack;
public class Postfix {
    
    int prec(char c){
    switch(c){
        case '^':
            return 3;
        case '*':
        case '/':
            return 2;
        case '+':
        case '-':
            return 1;       
    }
    return -1;
    }
    int isOperand(char cha){
        if((cha>='a' && cha<='z')||(cha>='A' && cha<='Z'))
            return 1;
        return -1;
    }
    
    void post(char[] c,Stack st,String pf){
    for(int i=0;i<c.length;i++){
    if(isOperand(c[i])==1){
        pf=pf+c[i];
    }
    else if(c[i]=='(')
        st.push('(');
    else if(c[i]==')'){
    while(!st.isEmpty() && !(st.peek().equals(')'))){
    pf=pf+st.pop();}
    st.pop();}
    else{
        while(!st.isEmpty() && prec(c[i])<=prec((char)st.peek()))
            pf=pf+(char)st.pop();
        st.push(c[i]);
    }
    }
    while(!st.isEmpty()){
    pf=pf+(char)st.pop();}
    System.out.println(pf);}
    
    public static void main(String[] args){
   
     String s= new String();
    System.out.println("enter expression: ");
    Scanner sc=new Scanner(System.in);
    s=sc.next();
    char[] ch=s.toCharArray();
    Stack st=new Stack();
    String pf="";
    Postfix p=new Postfix();
    p.post(ch,st,pf);
    
    } 
}
