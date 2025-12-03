import java.util.Scanner;

public class PeakIndexMountainarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int result = peak(arr);

        System.out.println("Result "+result);
    }

    static  int peak(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = (start+end)/2;
            if (arr[mid]<arr[mid+1]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return  start;
    }
}
