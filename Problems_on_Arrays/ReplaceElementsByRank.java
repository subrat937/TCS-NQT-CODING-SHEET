package Problems_on_Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ReplaceElementsByRank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n ];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //duplicate array:
        Map<Integer, Integer> map = new HashMap<>();
        int[] nums = arr.clone();
        Arrays.sort(nums);
        int k = 1;
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], k++);
            }
        }
        for(int i = 0; i < arr.length; i++) {
            nums[i] = map.get(arr[i]);
        }
       
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]+" ");
        }
        sc.close();
    }
    
}
