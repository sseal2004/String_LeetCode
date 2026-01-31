class Solution {
    
   static int[]vec = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    static String[] sym = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String intToRoman(int num) {

    String result = "";
    for(int i=0;i<vec.length;i++){
        if(num==0)break;
        int times = num/vec[i];
        while(times-- >0){
            result +=sym[i];
        }
        num=num%vec[i];
    }
    return result;
    }
}