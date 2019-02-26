class Solution {
    public void sortColors(int[] nums) {
        int hi = nums.length - 1;
        int low = 0;
        int mid = 0;
        int temp = 0;
        while(mid <= hi){
            switch(nums[mid]){
                case 0:
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    mid++;
                    low++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = nums[mid];
                    nums[mid] = nums[hi];
                    nums[hi] = temp;
                    hi--;
                    break;
            }
        }
        
    }
}