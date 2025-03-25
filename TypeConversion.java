
import java.util.*;

public class TypeConversion {
    public static void main(String[] args) {
        // this will show  error because int cant be converted into float.
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextFloat(); 

        // This will not show error because float can be converted into int but it looses some data
        // input would be integer value 
        Scanner sc = new Scanner(System.in);
        float num = sc.nextInt(); 
        System.out.println(num);
    }
}
