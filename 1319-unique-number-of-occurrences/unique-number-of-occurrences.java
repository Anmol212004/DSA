class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int freq[] = new int[map.size()];
        int k = 0;
        for (int x : map.keySet()) {
            freq[k] = map.get(x);
            k++;
        }
        for (int i = 0; i < freq.length; i++) {
            for (int j = i + 1; j < freq.length; j++) {
                if (freq[i] == freq[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}