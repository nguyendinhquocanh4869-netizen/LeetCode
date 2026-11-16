class Solution {
    public boolean isPalindrome(int x) {
        int kq = x;
        int result =0;
        while(x>0){
            int temp = x % 10;
            result = result * 10 + temp;
             x=x/10;
        }
        if(kq == result){
            return true;
        }else{
            return false;
        }
    }
}