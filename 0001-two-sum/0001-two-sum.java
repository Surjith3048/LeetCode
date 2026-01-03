class Solution {

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { 

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        int[] o1 = s.twoSum(new int[]{2, 7, 11, 15}, 9);
        int[] o2 = s.twoSum(new int[]{3, 2, 4}, 6);
        int[] o3 = s.twoSum(new int[]{3, 3}, 6);

        
    }
}
