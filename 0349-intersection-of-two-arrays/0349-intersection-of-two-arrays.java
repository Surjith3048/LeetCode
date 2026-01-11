import java.util.HashSet;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set=new HashSet<>();
        for(int n:nums1){
            set.add(n);
        }   
        HashSet<Integer> set2=new HashSet<>();
        for(int n : nums2){
            if(set.contains(n)){
                set2.add(n);
            }
        }
        int [] result=new int[set2.size()];
        int i=0;
        for(int n:set2){
            result[i++]=n;
        }
    return result;
    }
}