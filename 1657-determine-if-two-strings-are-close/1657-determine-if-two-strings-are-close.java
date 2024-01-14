import java.util.*;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();

        if (l1 != l2) {
            return false;
        }
        
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        for (char i : word1.toCharArray()) {
            hm1.put(i, hm1.getOrDefault(i, 0) + 1);
        }

        for (char i : word2.toCharArray()) {
            hm2.put(i, hm2.getOrDefault(i, 0) + 1);
        }

        ArrayList<Integer> ar1 = new ArrayList<>();
        ArrayList<Integer> ar2 = new ArrayList<>();
        
        Set<Character> keys = hm1.keySet();
        for (char key : keys) {
            if (!hm2.containsKey(key)) {
                return false;
            }
        }

        for (char key : keys) {
            ar1.add(hm1.get(key));
        }

        Set<Character> k = hm2.keySet();
        for (char key : k) {
            ar2.add(hm2.get(key));
        }

        Collections.sort(ar1, Comparator.nullsFirst(Comparator.naturalOrder()));
        Collections.sort(ar2, Comparator.nullsFirst(Comparator.naturalOrder()));
        
        return ar1.equals(ar2);
    }
}
