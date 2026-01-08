class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){

            if(map.containsKey(nums[i]) && i-map.get(nums[i])<=k){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
    public static void main(String[] args){

        Solution sol=new Solution();
        boolean a=sol.containsNearbyDuplicate(new int[] {1,2,3,1},3);
        boolean b=sol.containsNearbyDuplicate(new int[] {1,0,1,1},1);
        boolean c=sol.containsNearbyDuplicate(new int[] {1,2,3,1,2,3},2);
    }
    

}