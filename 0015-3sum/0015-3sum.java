class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ll = new ArrayList<>();
        Set<List<Integer>> s = new HashSet<>();
        Arrays.sort(nums);

        for(int i = 0; i<nums.length ; i++){
          
            int l  = i+1;
            int h = nums.length-1;
            while(h>l){
                
                    if(nums[i]+nums[l]+nums[h] == 0)
                    {
                          s.add(Arrays.asList(nums[i],nums[l],nums[h]));   
                          h--;
                          l++;  
                    }
                
                else if(nums[i]+nums[l]+nums[h] >0){
                    h--;
                    
                }
                else{
                    l++;
                }  
            }    
            
        }
        ll.addAll(s);
        return ll;
    }
        
    
}