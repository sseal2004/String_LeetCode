class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int index =0;
        int i=0;
        while(i<n){
            char curr_char= chars[i];
            int count =0;
            while(i<n && chars[i]==curr_char){
                i++;
                count++;
            }
            //assign
            chars[index]=curr_char;
            index++;
            // chars[index]=count; this work for single digit 
            //but multiple digit like 3 digit or two digit 
            if(count>1){
               String count_string = String.valueOf(count);
               for(char ch :count_string.toCharArray() ){
                chars[index] = ch;//assing count as string
                index++;

               }
            }
           
        }
        return index;

    }
}