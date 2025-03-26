public class TypePromotion {
    public static void main(String[] args) {
        // char a='a';
        // char b='b';
        // System.out.println((int) a);
        // System.out.println((int) b);
         //System.out.println(b-a);
        
        //  type promotion is not done with single character
        // Type promotion is only done with expressions 
        // System.out.println( a);


        // RULE 2:-if one operand is long ,double or float the whole experssion
        //  is promoted to long ,float or double whoever is large 

        // int a=10;
        // float b=20.20f;
        // long l =25;
        // double d=0;
        // int sum = a+b+c+l+d; This line give an error saying converting a double value into int
        // double sum =  a+b+l+d;
        // System.out.println(sum);

        byte a=5;
        // byte b=a*2; incompatible types: possible lossy conversion from int to byte(error)
        byte b= (byte) (a*2 ); //this is overcome by type casting
        System.out.println(b);


        
    }
}
