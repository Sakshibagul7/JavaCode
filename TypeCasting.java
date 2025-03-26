
import java.util.Scanner;


public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // this will show errors due to loss ofsome data (.99 would be loose )
        // float marks=99.99f;
        // int marks2=marks;
        // System.out.println(marks2);
        
        float marks=99.99f;
         int marks2= (int) marks;
        System.out.println(marks2);

        // JAVA allows user to convert a character into interger 
        // Converting a character into interger

        char c='a';
        int num =c;
        System.err.println(c);
    }
}
