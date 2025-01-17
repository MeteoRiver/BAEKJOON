import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            set.add(num);
        }
        
        int maxPick = nums.length / 2;
        
        return Math.min(set.size(), maxPick);
    }
}