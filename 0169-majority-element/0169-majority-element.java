import java.util.HashMap;
class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int count=nums.length;
        for(int k:map.keySet()){
            if(map.get(k)>count/2){
                return k;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Solution sol=new Solution();
        int a=sol.majorityElement(new int[] {3,2,3});
        int b=sol.majorityElement(new int[] {2,2,1,1,1,2,2});

        System.out.println(a);
        System.out.println(b);

    }
}