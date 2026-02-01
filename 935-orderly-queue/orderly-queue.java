class Solution {
    public String orderlyQueue(String s, int k) {
        if(k>1){
            char tempArray[]=s.toCharArray();
            Arrays.sort(tempArray);
            return new String(tempArray);
        }else{
            String result =s;
            int n= s.length();
            //shuru ke first character ko last me daalenge agar k==1 hai toh
            for(int i=1;i<n;i++){
                // s = pura string + last me shuru ka starting wala string
                String temp =s.substring(i)+s.substring(0,i);
                // lexicographically smallest string(find minimum) 
                if (temp.compareTo(result) < 0) {
                    result = temp;
                }




            }
            return result;

        }
    }
}