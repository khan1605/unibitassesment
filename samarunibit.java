import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class samarunibit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();

        scanner.close();

        System.out.println("First Combination For \"" + target + "\" : " + Arrays.deepToString(twoSum(nums, target)));
        int[] mergedNums = merge(nums);
        System.out.println("Merge Into a single Array : " + Arrays.toString(mergedNums));
        System.out.println("Second Combination For \"" + target * 2 + "\" : " + Arrays.deepToString(twoSumMerged(mergedNums, target * 2)));
    }

    public static int[][] twoSum(int[] nums, int target) {
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result.add(new int[]{nums[i], nums[j]});
                }
            }
        }

        return result.toArray(new int[0][]);
    }

    public static int[] merge(int[] nums) {
        int[] mergedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(mergedNums);
        return mergedNums;
    }

    public static int[][] twoSumMerged(int[] nums, int target) {
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target / 2) {
                    result.add(new int[]{nums[i], nums[j]});
                }
            }
        }

        return result.toArray(new int[0][]);
    }
}