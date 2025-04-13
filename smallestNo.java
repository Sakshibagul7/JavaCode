public class smallestNo {

    public static int smallest(int values[],int ans){
        for(int i=1;i<values.length;i++){
            if(values[i]<ans){
                ans=values[i];
            }
        }
        return ans;
    }
    public static void main (String [] args){
        int values[]={23,34,43,32,2,34,44,65,76,89,9};
        int ans = values[0];
        int small = smallest(values, ans);
        System.out.println(small);
        
    }
}
