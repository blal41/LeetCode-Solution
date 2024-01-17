class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int ele : arr){
            if(hm.containsKey(ele)){
                hm.put(ele , hm.get(ele)+1);
            }
            else {
                hm.put(ele ,1);
            }
        }
         ArrayList<Integer> occurrences = new ArrayList<>(hm.values());
         Set<Integer> set = new HashSet<>(occurrences);

        
        return set.size() == occurrences.size();
    }
}