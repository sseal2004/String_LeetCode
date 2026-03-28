class Solution {
    boolean checkCapital(String word){
        for(char ch : word.toCharArray()){
            if(ch < 'A'||ch>'Z') return false;
        }
        return true;
    }
     boolean checkSmall(String word){
        for(char ch :  word.toCharArray()){
            if(ch < 'a'||ch>'z') return false;
        }
        return true;
    }

    public boolean detectCapitalUse(String word) {
        if(checkCapital(word)||checkSmall(word)||checkSmall(word.substring(1)))
        return true;
        else 
        return false;
    }
}