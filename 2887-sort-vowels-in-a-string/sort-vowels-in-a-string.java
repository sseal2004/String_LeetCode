class Solution {
    public String sortVowels(String s) {
        ArrayList<Character>vowel = new ArrayList<>();
        for(int i=0;i<s.length();i++) if(isVowel(s.charAt(i))) vowel.add(s.charAt(i));

        Collections.sort(vowel);
        StringBuilder ans = new StringBuilder(s);
        int idx=0;
        for(int i=0;i<s.length();i++)if(isVowel(s.charAt(i))) ans.setCharAt(i, vowel.get(idx++));

        return ans.toString();

    }
    public boolean isVowel(char ch){
        return (ch=='A'||ch=='I'||ch=='E'||ch=='O'||ch=='U'||ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e');
    }
}