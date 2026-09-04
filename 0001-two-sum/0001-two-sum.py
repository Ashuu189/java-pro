class Solution(object):
    def twoSum(self, nums, target):
        lst=[]
        n=len(nums)
        for i in range(n):
            for j in range(i+1,n):
                if nums[i]+nums[j]==target:
                   lst.append(i)
                   lst.append(j)
        return lst



       
        