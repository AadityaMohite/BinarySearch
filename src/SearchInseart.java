import java.util.Scanner;

public class SearchInseart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();


        int [] arr = new int[n];

        System.out.println("Enter the elements of an array");
        for (int i = 0; i < arr.length; i++) {
              arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element ");
        int target = sc.nextInt();



      int result =  search(arr,target);

        System.out.println("Position of search element will be: "+ result);


    }

    static int search(int [] arr,int target){
        int  start = 0;
        int   end = arr.length-1;

        while(start<= end){

            int mid = (start+end)/2;

            if (arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                start = mid + 1;
            }else{
                end = mid -1;
            }

        }


        return start;
    }
}
