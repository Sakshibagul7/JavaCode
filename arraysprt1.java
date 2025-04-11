public class arraysprt1{
    // public static void main(String []args ){
    // Scanner sc =new Scanner(System.in);
    // int marks[] = new int[10]; //First method to create an array
    // // int marks1 []={1,2,3,4,5,6}; // Second method to create an array
    // String str[] = {"mango","gava"};


    //  marks[0]=sc.nextInt();
    //  marks[1]=sc.nextInt();
    //  marks[2]=sc.nextInt();
    //  marks[3]=sc.nextInt();

    //  System.out.println("phy:"+ marks[0] +"history: " + marks[1] + "che:" + marks[2]+ "maths:"+marks[3] );

    // //  if you update any value from that 
    //     marks[0]=marks[0]+1;
     
    //     System.out.println("phy:"+ marks[0]);
    // }


    //  
    public static void update( int marks[],int nonchangeble){
        nonchangeble =10;
        for(int i=0;i<marks.length;i++){
            marks[i]+=1;
        }
    }
    public static void main(String[] args) {
        int marks[]={89,99,77};
        int nonchangeble =5;
        update(marks,nonchangeble);
        for(int i=0;i<marks.length;i++){
        System.out.println(marks[i]);
    }
    System.out.println(nonchangeble); // this is not going to be changed
    
    }
}