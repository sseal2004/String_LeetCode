class Solution {
    public boolean isCircularSentence(String s) {
        int i=0;
        while(i<s.length()){
        if(s.charAt(i)==' '){//trim
            if(s.charAt(i-1)!=s.charAt(i+1)) return false;
        }
        i++;
        }
        return s.charAt(0) == s.charAt(s.length()-1);//true
    }
}