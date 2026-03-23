package Array;

public class smallest_element {
    public static void main(String[] args) {
        int [] arr={5,6,8,3,2,4,6};
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println(smallest);
    }
    
}
