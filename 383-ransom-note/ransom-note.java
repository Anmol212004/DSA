class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for(char x : magazine.toCharArray()){
            freq[x - 'a']++;
        }
        for(char x : ransomNote.toCharArray()){
            freq[x - 'a']--;
        }
        for(int x : freq){
            if(x<0){
                return false;
            }
        }
        return true;
    }
}