import java.util.Scanner;

public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int[] runSum = new int[nums.length]; 
        int i, j;
        runSum[0] = nums[0];
        for (i = 1; i < nums.length; i++) {
            runSum[i] = nums[i] + runSum[i-1];
        } 
        return runSum;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of array: ");
        int size = sc.nextInt();
        int nums[] = new int[size];
        if (nums.length >= 1 && nums.length <= 1000) {
               System.out.println("Please enter intergers to array: ");
               int i;
               for (i = 0; i < nums.length; i++)
                     nums[i] = sc.nextInt();
               System.out.print("Array elements are: ");
               for (i = 0; i < nums.length; i++) 
                   System.out.print(nums[i] + " ");
               for (int run[] : runningSum(nums)) {
                   i = 0;
                   System.out.print(run[i] + " ");
                   i++;
               }
        } 
        else 
           System.out.println("The array size should be in the range from 1 to 1000");
       
    }
}