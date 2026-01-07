class Solution {
    public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> hash =new HashSet<>();
		for(int i=0;i<nums.length;i++) {
			if(hash.contains(nums[i])) {
				return true;
			}
			hash.add(nums[i]);
		}
        return false;
    }
    public static void main(String[] args){
        Solution s=new Solution();
        boolean a=s.containsDuplicate (new int[] {1,2,3,1});
        boolean b=s.containsDuplicate (new int[] {1,2,3,4});
        boolean c=s.containsDuplicate (new int[] {1,2,3,3,3,4,3,2,4,2});
    }
}