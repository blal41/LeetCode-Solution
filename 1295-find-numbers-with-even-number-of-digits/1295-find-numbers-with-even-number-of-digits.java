class Solution {
    public int findNumbers(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int c  = 0 ;
        for(int ele : nums){
            int i = 0 ;
            while(ele>0){
               i++;
               ele = ele/10;
            }
            if(i%2 == 0){
                c++;
            }

        }
        return c;
    }
}