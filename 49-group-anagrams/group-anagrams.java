class Solution {
    public List<List<String>> groupAnagrams(String[] strs) { 
        HashMap<String, List<String>> groups = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            HashMap<Character , Integer> map= new HashMap<>(); 
               int []freq=new int[26];
                 for(int j=0;j<s.length();j++){
        
        char ch = s.charAt(j);
        map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        String key = "";

            for(char ch = 'a'; ch <= 'z'; ch++) {
                key += ch + "" + map.getOrDefault(ch, 0);
            }
        // String key = map.toString();        
        groups.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(groups.values());

    }
}