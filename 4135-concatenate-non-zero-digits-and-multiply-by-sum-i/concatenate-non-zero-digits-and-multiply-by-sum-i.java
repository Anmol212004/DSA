class Solution {
    public long sumAndMultiply(int n) {
        int x =0;
        int sum =0;
        int reverse = 0;
        while(n>0){
            int y = n%10;
            n = n/10;
            if(y!=0){
                sum += y;
                x = x*10 + y;
            }
        }
        while(x>0){
        int digit =x%10;
           reverse = reverse * 10 + digit;
           x = x/10; 
        }
        return (long)reverse * sum;
    }
}