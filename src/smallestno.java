
import java.util.*;
public class smallestno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(rounding(k,n));
    }
    public static int  rounding(int k,int n){
        int num= (int) Math.pow(10,k);
        int lcd=gcd(num,n);
        System.out.println(lcd);
        int result=(num*n)/lcd;


        return result;

    }
    public static int gcd(int digit,int n){
        if(digit==0||n==0){
            return 0;
        }
        if(digit==n){
            return n;
        }
        if(digit>n){
            return gcd(digit-n,n);
        }
        return gcd(digit,n-digit);
    }


}
