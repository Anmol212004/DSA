class Solution {
    public int mySqrt(int x) {
        int i =1;
        int answer =0;
        while((long)i*i <=x){
            answer =i;
            i++;
        }
        return answer;
    }
}