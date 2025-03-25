
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        // sc.next is used for one word only
        // Scanner sc =new Scanner(System.in);
        // String input =sc.next();
        // System.out.println(input);

          // sc.nextLine is used for line or sentence 
        // String name =sc.nextLine();
        // System.out.println(name);

         // sc.nextInt is used for integer values 
        // int age =sc.nextInt();
        // System.out.println(age);
         
        // sc.nextFloat is used for floting  values 
        // float pi = sc.nextFloat();
        // System.out.println(pi);

        // sc.nextBool is used for boolean values 
        // boolean bool= sc.nextBoolean();
        // System.out.println(bool);


        // Area of circle 
        Scanner sc =new Scanner(System.in);
        float rad =sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println(area);

       
      }
}
