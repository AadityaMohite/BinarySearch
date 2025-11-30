import java.util.Scanner;

public class FloorNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of an array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element that can be Searched:");
        int target = sc.nextInt();

        int result = Floornumber(arr,target);

        if (result >= arr.length) {
            System.out.println("Ceiling does not exist");
        } else {
            System.out.println("Ceiling found at index " + result +
                    " Number: " + arr[result]);
        }
    }


    static  int Floornumber (int[] arr, int target){

        int  start = 0;
        int   end = arr.length-1;

        while(start<= end){

            int mid = (start+end)/2;

            if (arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                start = mid + 1;
            }else{
                end = end -1;
            }


        }


        return end;

    }
}
