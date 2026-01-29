class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length())return false;
    int[]freq= new int[26];
    for(int i=0;i<s.length();i++){
        //'a'-'a'=0
        //'b'-'a'=1
        //'c'-'a'=2 asper ASCII value
        freq[s.charAt(i)-'a']++;
        freq[t.charAt(i)-'a']--;
    }
    for(int count:freq){
       if(count!=0)return false; 
    }
    return true;
    }
}