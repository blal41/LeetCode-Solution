class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> set = new HashSet<>();
        List<List<Integer>> ll = new ArrayList<>();
         List<Integer> w = new ArrayList<>();
          List<Integer> l = new ArrayList<>();
        HashMap<Integer ,Integer> hm = new HashMap<>();

        for(int i = 0 ; i<matches.length ; i++){

            set.add(matches[i][0]);
            set.add(matches[i][1]);
            
            if(hm.containsKey(matches[i][1])){
                hm.put(matches[i][1] , hm.get(matches[i][1])+1);
            }
            else{
                hm.put(matches[i][1] ,1);
            }
        }
        for(int key : set){
            if(!hm.containsKey(key)){
                w.add(key); 
            }
            else {
                if(hm.get(key) == 1){
                    l.add(key);
                }
            }

        }
        Collections.sort(w);
        Collections.sort(l);
        ll.add(w);
        ll.add(l);
        return ll;

       


        
    }
}