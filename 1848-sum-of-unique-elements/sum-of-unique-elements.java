class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int x : nums){
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        for(int x : hm.keySet()){
            if(hm.get(x) == 1){
                sum = sum + x;
            }
        }
        return sum;
    }
}