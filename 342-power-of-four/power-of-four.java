class Solution {
    public boolean isPowerOfFour(int n) {
        int x =0;
        while(Math.pow(4, x)<=n){
        if(n == Math.pow(4, x)){
            return true;
        }
        x++;
        }
        return false;
    }
}