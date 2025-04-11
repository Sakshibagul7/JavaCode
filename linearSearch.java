public class linearSearch {
    
    public static int linearS(int value[], int key){
        for(int i=0;i<value.length;i++){
            if(value[i]==key){
                return i;
            }
        } return -1;
    }
    public static void main(String[] args) {
        int value[] = {45,67,89,55,44,34,65};
        int key = 550;
         int index =linearS(value, key);
            if(index==-1){
                System.out.println("key not found ");
            }else{
                System.out.println("Key found");
            }
        }
    }

