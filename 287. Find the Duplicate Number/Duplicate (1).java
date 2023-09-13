class Solution {
    // public int findDuplicate(int[] nums) {
    //     Arrays.sort(nums);
    //     for(int i =0,j=i+1; i<nums.length-1; i++,j++){
    //        if(nums[i] == nums[j]){
    //            return nums[i];
    //        }
    //     }
    //     return 0;
    // }

    public int findDuplicate(int[] nums) {
        while(nums[0] != nums[nums[0]]){
            int temp = nums[nums[0]];
            nums[nums[0]] =nums[0];
            nums[0] =temp;
        }
        return nums[0];
    }
    
}