class Solution {
    public boolean validPalindrome(String s) {
        int start =0;
        int end =s.length()-1;
        while(start< end){
            if(s.charAt(end)!=s.charAt(start)){
                return isPalindrome(s,start+1,end)||isPalindrome(s,start,end-1);
            }
            start++;
            end--;
        }
      return true;
    }
    static boolean isPalindrome(String s,int start,int end){
        while(start<end){
        if(s.charAt(end)!=s.charAt(start))return false ; 
        start++;
        end--;  
        }
        return true;
    }
}