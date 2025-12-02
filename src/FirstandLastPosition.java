import java.util.Scanner;

public class FirstandLastPosition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter the elements of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element");
        int target = sc.nextInt();

        int[] ans = searchRange(arr, target);   // FIXED
        System.out.println("First position: " + ans[0]);
        System.out.println("Last position: " + ans[1]);
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        int start = search(nums, target, true);
        int end = search(nums,target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    static int search(int[] nums, int target, boolean firstIndexposition){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(nums[mid] < target){
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                ans = mid;
                if (firstIndexposition){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
