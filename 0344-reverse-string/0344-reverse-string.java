class Solution {
    public void reverseString(char[] s) {

        int left=0;
        int right=s.length-1;

        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;

            right--;
            left++;
        }
        System.out.println(s);

    }
    public static void main(String[] args){
        Solution sol=new Solution();
        sol.reverseString(new char[]{'h','e','l','l','o'});
        sol.reverseString(new char[]{'H','a','n','n','a','h'});
    }
}