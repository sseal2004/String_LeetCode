class Solution {
    public boolean halvesAreAlike(String s) {
        return vowelCount(s.substring(0,s.length()/2))==vowelCount(s.substring(s.length()/2));
    }
    public static int vowelCount(String s){
        int count =0;
        for(char c : s.toCharArray()){
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') 
                count++;
        }
            return count;

    }
}