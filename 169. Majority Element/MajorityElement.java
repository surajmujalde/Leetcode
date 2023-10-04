class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        int start = 0, low = nums.length-1;
       
           int  mid = start+(low-start)/2 ;
            return nums[mid];
    }
    }