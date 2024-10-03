// Use Hashmap to get O(n) in both space and time complexity 

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= nums.length-1; i++) {
            if(map.containsKey(target-nums[i])) {
                return new int[]{map.get((target-nums[i])),i};
            }

            map.put(nums[i], i);
        }

        return new int[]{0, 0};
    }
}