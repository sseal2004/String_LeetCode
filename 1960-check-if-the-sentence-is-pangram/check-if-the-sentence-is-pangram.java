class Solution {
    public boolean checkIfPangram(String sentence) {
        return allAphabet(sentence);
        
    }
    public boolean allAphabet(String str){
        str =  str.toLowerCase();
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            if(!str.contains(String.valueOf(ch))){
                return false;
            }
        }
        return true;
    }
}