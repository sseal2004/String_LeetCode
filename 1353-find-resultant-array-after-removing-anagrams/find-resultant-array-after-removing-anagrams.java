class Solution {
    public List<String> removeAnagrams(String[] words) {
        int n = words.length;
        List<String>list = new ArrayList<>();

        String []str = new String[n];
        for(int i=0;i<n;i++){
            char[]arr = words[i].toCharArray();
            Arrays.sort(arr);
            str[i] =new String(arr);
        }
        list.add(words[0]);

        for(int i=1;i<n;i++){
            if(!str[i-1].equals(str[i]))
            list.add(words[i]);
        }
        return list;
    }

}