class Solution(object):
    def productExceptSelf(self, nums):
        
        
        b=[]
        b.append(1)
        left=1
        right=1
        res=1
        c=[]

        for i in range(len(nums)):

            if(i>1 and nums[i]!=nums[-1]):
                left=left*nums[i]
                b.append(left)
            else:
                if(i!=len(nums)-1):
                    left=left*nums[i]
                    b.append(left)

        for i in range(len(nums)-1,-1,-1):

            res=b[i]*right
            right=right*nums[i]
            c.insert(0,res)

        return c
