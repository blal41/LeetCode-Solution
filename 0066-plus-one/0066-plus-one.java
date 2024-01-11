class Solution {
    public int[] plusOne(int[] digits) {
        int sum = 0,n =0;
        int l = digits.length;

        if(digits[l-1]>8){
            digits[l-1] = 0;
            n=1;
            for(int i = digits.length-2 ; i>=0 ;i--){
            sum = digits[i]+n;
            if(sum>9){
               digits[i] = sum%10;
               n=sum/10;
            }
            else {
                digits[i] = sum;
                n=0;
            }
            if(n==0){
                return digits;
            
            }
            }
        }
            
        
        else {
            digits[l-1] = digits[l-1]+1;
        }
          if (n != 0) {
            int[] newlst = new int[l + 1];
            newlst[0] = 1;
            System.arraycopy(digits, 0, newlst, 1, l);
            return newlst;
        } else {
            return digits;
        }
    }
}