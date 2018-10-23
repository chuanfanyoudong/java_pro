package java_algorithm;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSumSimpleResult(int[] nums, int target) {

        for (int i = 0; i < nums.length; i ++){
            for (int j = 0; j < nums.length; j ++){
                if (nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }throw new IllegalArgumentException("No two sum so;ution");
    }
    public static int[] twoSumHashMap(int[] nums, int target) {
        /**
         * soulution with HashMap
         */
        int[] solution = new int[2];
        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i ++){
            int result = target - nums[i];
            if (myMap.containsKey(result)){
                solution[0] = i;
                solution[1] = myMap.get(result);
                return solution;
            }
            myMap.put(nums[i],i);
        }
        return null;
    }
    public static void main(String[] args) {

        int[] nums ={1,2,3,4};
        int target = 4;
        int[] result = twoSumHashMap(nums, target);
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }

    }
}
