package Array;
class Sorted_array{
    public static void main(String[] args) {
        int [] arr={32,4,5,6,4,3};
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                // arr[i-1]=arr[i];
            }
            else {
                System.out.println("false");
                return;
            }
        }
        System.out.println(true);
        return;
    }
}