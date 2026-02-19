class Solution {
    public int countBinarySubstrings(String s) {
        int currCount =1;
        int prevCount =0;
        int result =0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                currCount++;
            }else{
                result+= Math.min(prevCount,currCount);
                prevCount = currCount;//prev comes curr substring position
                currCount = 1;
            }
        }
        return result+Math.min(prevCount,currCount);// add the leftover prev and curr count
    }
}