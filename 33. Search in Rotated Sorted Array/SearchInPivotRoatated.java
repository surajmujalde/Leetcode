class Solution {
    public static int pivotIndex(int[] nums){
        int start = 0, end = nums.length-1, mid ;
        while(start<=end){
            mid = start+(end-start)/2 ;

            if(nums[start]== nums[end]){
                return start;
            }
            if(mid-1>=0 && nums[mid] <nums[mid-1]){
                return mid-1 ;
            }
            else if(mid+1< nums.length && nums[mid]> nums[mid+1]){
                return mid;
            }
            else if(nums[start]>nums[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static int binarySearch(int arr[],int start, int end, int num){

    while(start<=end){
      int mid= start+(end-start)/2 ;
      
     if(arr[mid] == num){
         return mid;
     }
      if(arr[mid] > num){
        end = mid-1;
      }
      else{
        start = mid+1;
      }
    }
    return -1;
    
  }

    public int search(int[] nums, int target) {
        int pivot = pivotIndex(nums);
        int ans = -1 ;

        if(target>= nums[0] && target <= nums[pivot]){
            ans = binarySearch(nums,0,pivot, target);
        }
        else{
              ans = binarySearch(nums,pivot + 1,nums.length-1, target); 
        }
        return ans;
        
    }
}