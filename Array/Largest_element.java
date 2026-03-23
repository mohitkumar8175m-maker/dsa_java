package Array;
import java.util.Scanner;
// package Array;
public class Largest_element{
public static void main(String[] args) {
    System.out.println("take user imput");
    //create object
    // int max=arr[0];
    Scanner sc = new Scanner(System.in);
        int []arr=new int[5];
        System.out.println("Enter 5 element");
        for(int i =0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("max");
        int max = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            // System.out.println(max);
        }
    }
    System.out.println(max);
    }
}
