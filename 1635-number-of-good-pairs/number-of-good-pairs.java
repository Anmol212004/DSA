class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (int x : map.keySet()) {
            if (map.get(x) != 1) {
                int n = map.get(x);
                count += n * (n - 1) / 2;
            }
        }
        return count;
    }
}