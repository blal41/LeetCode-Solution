class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
   
        List<Integer> a = new ArrayList<>();
        int i = 0;
        while(i< arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr , i , correct);
            }
            else {
                i++;
            }
        }
        for(int j = 0 ; j<arr.length; j++){
            if(arr[j] != j+1){
                a.add(j+1);
            }
        }
        return  a;
    }
     void  swap(int []arr , int first , int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}