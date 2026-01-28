class Solution {
    public boolean arrayStringsAreEqual(String[] s1, String[] s2) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for(String s : s1){
            a.append(s);
        }
        for(String s : s2){
            b.append(s);
        }
        String word1 = a.toString();
        String  word2 = b.toString();
        if(word1.equals(word2)){
            return true;
        }  
        else { return false;}

    }
}