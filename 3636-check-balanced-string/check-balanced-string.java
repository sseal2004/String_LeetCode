class Solution {
    public boolean isBalanced(String num) {
        char []arr = num.toCharArray();
        int sumOdd=0;
        int sumEven = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
        int digit = arr[i] - '0'; // convert char to digit

            if(i%2 == 0)sumEven +=digit ;
            else sumOdd += digit;
            
        }
        return sumEven == sumOdd;
    }
}