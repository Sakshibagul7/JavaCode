
import java.util.*;
public class ConditionalStatement {
    public static void main(String[] args) {
        // System.out.println("Enter age");
        Scanner sc =new Scanner (System.in);
        // int age =sc.nextInt();
        // if(age==13 && age<18 ){
        //     System.out.println("Teenager");
        // }else if(age>=18){
        //     System.out.println("Adult");
        // }else{
        //     System.out.println("Not adult");
        // }

        // largest number between 2 giver numbers
        // System.out.println("Enter num1");
        // int num1=sc.nextInt();
        // System.out.println("Enter num2");
        // int num2=sc.nextInt();

        // if(num1>num2){
        //     System.out.println("num1 ig greater than num2");
        // }else{
        //     System.out.println("num2 ig greater than num1");
        // }


        // print if a number is even or odd
        // System.out.println("Enter num");
        // int num =sc.nextInt();
        // if(num %2==0){
        //     System.out.println("Number is even");
        // }
        // else{
        //     System.out.println("Number is odd");
        // }


        //  Income tax calculator 
        // System.out.println("Enter income");
        // int income =sc.nextInt();
        // int tax;

        // if(income <500000){
        //     tax=0;
        // }
        // else if (income>=500000 && income<=1000000){
        //     tax =   (int )(income * 0.2);
        // }
        // else{
        //     tax=(int)(income*0.3);
        // }
        // System.out.println(tax);


        // print largest of 3 numbers

        // System.out.println("Enter number1");
        // int num1=sc.nextInt();
        // System.out.println("Enter number2");
        // int num2=sc.nextInt();
        // System.out.println("Enter number3");
        // int num3=sc.nextInt();
        
        // if(num1>num2 && num2>num3){
        //     System.out.println("Num1 is greter");
        // }else if(num2>num1 && num2>num3){
        //     System.out.println("Num2 is greter");
        // }else {
        //     System.out.println("Num3 is greter");
        // }

        // ternary operator
        //  int larger=(9>8)?9:8;
        //  System.out.println(larger);

        //  String type =(5%2==0)?"Even":"Odd";
        //  System.out.println(type);

        // Check if student is pass or fail 
        System.out.println("Enter marks");
        int marks=sc.nextInt();
        String result =(marks>=33)? "pass" : "fail ";
        System.out.println(result);
    }
}
