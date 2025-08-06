import java.util.*;

class BinarySearch {
    public static int searchInsert(int[] nums, int target) {
        
        int low = 0, high = nums.length - 1;
        int x = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else if (target > nums[mid]) {
                low = mid + 1;
            }
        }

        
        x = low;
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

      
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int result = searchInsert(nums, target);

        System.out.println("Position to insert or found at index: " + result);
    }
}
