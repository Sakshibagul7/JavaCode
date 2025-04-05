
import java.util.Scanner;

import org.xml.sax.SAXNotRecognizedException;





public class Functions {

    // public static int calculateSum (int num1,int num2){
    //     int sum=num1+num2;
    //     return sum;
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int num1=sc.nextInt();
    //     int num2=sc.nextInt();
    //     int sum = calculateSum(num1, num2);
    //     System.out.println("Sum is " + sum);

    // }


    // product of the 2 variables

    // public static int product(int a,int b){
    //     int product =a*b;
    //     return product;
    // }

    // public static void main(String[] args) {
    //     Scanner sc =new Scanner(System.in);
    //     int a =sc.nextInt();
    //     int b=sc.nextInt();
    //     int product=product(a, b);
    //     System.out.println("Product is " + product);
    // }

    //  Calculate the factorial of n

    // public static int  factorial(int n){
    //     int f=1;
    //     for(int i=1;i<=n;i++){
    //         f = f*i;
    //     }
    //     return f;
    // }

    // public static void main(String[] args) {
    //     Scanner sc =new Scanner(System.in);
    //     int n= sc.nextInt();
    //     int factorial= factorial(n);
    //     System.out.println("Factorial of given numer is "+ factorial);
    // }

    //  check if number is prime or not 

    // public static boolean  isPrime(int n){
    //     boolean isprime=true;
    //     for(int i=2;i<=n-1; i++){
    //         if(n%i==0){
    //             isprime=false;
    //             break;
    //         }
    //     }
    //     return isprime;
    // }


    // public static void main(String[] args) {
    //     Scanner sc =new Scanner(System.in);
    //     int n = sc.nextInt();
    //     boolean ans = isPrime(n);
    //     System.out.println("ANS is "+ ans);

    // }

    // Optimised approach

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }

        for(int i=2;i<= Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    // prime in given range

    public static void inRange(int n){
       for(int i=0;i<=n;i++){
        if(isPrime(i)==true){
            System.out.println(i);
        }
    }
    System.out.println();
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        // boolean isprime= isPrime(n);
        // System.out.println("the given number isprime: " + isprime);
        inRange(n);
    }
}
