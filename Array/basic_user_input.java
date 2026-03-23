package Array;
import java.util.Scanner;
// package Array;
public class basic_user_input{
public static void main(String[] args) {
    System.out.println("take user imput");
    //create object
    Scanner sc = new Scanner(System.in);
        int []arr=new int[5];
        System.out.println("Enter 5 element");
        for(int i =0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("print element");
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
