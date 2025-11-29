
import java.util.Scanner;
public class SimpleBinarySearch {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of an array");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Element that will be Searched");
        int target =  sc.nextInt();

        int result = Binary(arr,target);

        if (result==-1){
            System.out.println("Number is not found at any index so Sad");
        }else {
            System.out.println("Number is Found at the index is: "+ result);
        }


    }

    static  int Binary(int[] arr, int target){

        int start = 0;
        int end =  arr.length-1;




        while(start<=end) {

            int mid = (start + end) / 2;

            if (arr[mid] == target) {

                return mid;
            } else if (arr[mid] > target) {

                end = mid - 1;

            }else {
                start = mid+1;

            }
        }
        return -1;
    }
}