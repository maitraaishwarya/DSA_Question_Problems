package com.company;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum{
    public static void main(String[] args){
        int[] numbers = new int[] {2,7,11,15};
        int target = 6;
        int[] result = getTwoSum(numbers, target);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] getTwoSum(int[] numbers, int target){
        Map<Integer, Integer> visitedNumbers = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int delta = target - numbers[i];
            if(visitedNumbers.containsKey(delta)){
                return new int[] {visitedNumbers.get(delta),i};
            }
            visitedNumbers.put(numbers[i], i);
        }
        return new int[] {-1,-1};
    }
}


// For leet code only this much

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         Map<Integer, Integer> visitedNumbers = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             int delta = target - nums[i];
//             if(visitedNumbers.containsKey(delta)){
//                 return new int[] {visitedNumbers.get(delta),i};
//             }
//             visitedNumbers.put(nums[i], i);
//         }
//         return new int[] {-1,-1};
//     }
// }