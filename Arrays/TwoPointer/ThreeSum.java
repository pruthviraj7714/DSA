package Arrays.TwoPointer;

import java.util.*;


public class ThreeSum {
    //brute force solution - time complexity - > O(n^3)
    public static List<List<Integer>> ThreeSumbruteforce(int nums[]) {
        List<List<Integer>> result = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();

        for(int i = 0; i < nums.length-2; i++) {
            for(int j = i+1; j < nums.length-1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> ans = new ArrayList<>();
                        ans.add(nums[i]);
                        ans.add(nums[j]);
                        ans.add(nums[k]);
                        Collections.sort(ans);
                        set.add(ans);
                    }
                }
            }
        }
        result.addAll(set);
        return result;
    }


    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = ThreeSum.ThreeSumbruteforce(nums);
        System.out.println(result);

        
    }
    
}

