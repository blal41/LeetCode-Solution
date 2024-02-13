class Solution {
    public String firstPalindrome(String[] words) {
        for(int i = 0 ; i<words.length ; i++ ){
            String str = words[i];
            boolean flag = true;
            for(int j = 0 ; j<(str.length())/2; j++){
                if(str.charAt(j) != str.charAt(str.length()-1-j)){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                return str;
            }
        }
        return "";
    }
}