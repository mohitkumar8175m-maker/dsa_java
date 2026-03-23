// package Array;
public class Second_largest_element {
    public static void main(String[] args) {
        int [] arr={1,3,5,4,8};
        int largest = arr[0];
        int secondlargest= -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest= arr[i];
            }
        }
            System.out.println("Second largest");
            for(int i =0;i<arr.length;i++){
                if(arr[i]>secondlargest && arr[i] != largest){
                    secondlargest= arr[i];

                }
            }
            System.out.println(secondlargest);

        }
    }
    

