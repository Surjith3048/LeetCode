class Solution(object):
    def longestConsecutive(self, nums):
            
        b=set(nums)
        
        maxlen=0
        for i in b:
            if(i-1 not in b):
                count=1
                current=i
                while(current+1 in b):
                    current+=1
                    count+=1
                
                maxlen=max(maxlen,count)
            
        return maxlen