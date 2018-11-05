class Solution {
    public int[] reversed(int[] x){
        for(int i = 0; i < x.length / 2; i++)
            {
                int temp = x[i];
                x[i] = x[x.length - i - 1];
                x[x.length - i - 1] = temp;
            }
        return x;
    }
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length < 2){
            return new int[]{0,0};
        }
        int[] res = new int[2];
        HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < nums.length ; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
               int[] y = {i, map.get(diff)};
                return reversed(y);
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No solution");
    }
    
}