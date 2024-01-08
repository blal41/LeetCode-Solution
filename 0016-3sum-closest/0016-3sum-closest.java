class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        if(len == 3){
            return nums[0]+nums[1]+nums[2];
        }
        int diff = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0 ; i<len ; i++){
            int l = i+1;
            int h = len-1;
            while(h>l){
                 sum = nums[i]+nums[l]+nums[h];
                if(Math.abs(target-sum)<Math.abs(target-diff)){
                    diff = sum;
                   
                }
                else if(sum>target){
                    h--;
                }
                
                else {
                    l++;
                   
                }
            }
        }
        return diff;
        
    }
}