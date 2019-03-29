
import java.util.Arrays;

public class Primenumber {
    
    
    public static void main(String[] args){
       /* boolean primes[]=new boolean[100];
     Arrays.fill(primes,true);        
    primes[0]=primes[1]=false;       
    for (int i=2;i<primes.length;i++) {
        
        if(primes[i]) {
            System.out.println(i);
            for (int j=2;i*j<primes.length;j++) {
                primes[i*j]=false;
            }
        }
    }*/
    int a=50,b=10;
    if(a<0 && b<0){
    System.out.print(0);
    return;
    }
    int max=Math.max(a,b);
     
    boolean primes[]=new boolean[max];
     Arrays.fill(primes,true);        
    primes[0]=primes[1]=false;       
    for (int i=2;i<primes.length;i++) {
        
        if(primes[i]) {
           // System.out.println(i);
            for (int j=2;i*j<primes.length;j++) {
                primes[i*j]=false;
            }
        }
    }
    int sum=0;
    if(a<0)a=0;
    if(b<0)b=0;
    for(int k=Math.min(a,b);k<Math.max(a,b);k++){
    if(primes[k]==true){sum+=k;}
    }
 System.out.print(sum);
    }
}
