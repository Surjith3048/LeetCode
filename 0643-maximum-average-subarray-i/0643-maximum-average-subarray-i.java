class Solution {
    public double findMaxAverage(int[] nums, int k) {
		
		int sum=0;
		
		for(int i=0;i<k;i++) {
			sum=sum+nums[i];
		}
		double max=sum;
		for(int i=k;i<nums.length;i++) {
			
			sum=sum+nums[i]-nums[i-k];
			max=Math.max(max, sum);
		}
		double avg=max/k;
		return avg;
		
         
    }
	
	public static void main(String[] args) {
		
		Solution sol=new Solution();
		double a=sol.findMaxAverage(new int[] {1,12,-5,-6,50,3} ,4);
		double b=sol.findMaxAverage(new int[] {5},1);
		
		System.out.println(a);
		System.out.println(b);
		
	}
}