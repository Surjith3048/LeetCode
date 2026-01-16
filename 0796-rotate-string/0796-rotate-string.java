class Solution {
    public boolean rotateString(String s, String goal) {
        
        String contain=s+s;
        if(s.length()!=goal.length()){
            return false;
        }

        if(contain.contains(goal)){
            return true;
        }
    return false;
    }
}