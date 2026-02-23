class Solution {
    public boolean closeStrings(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        if (m != n) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // frequency count
        for (int i = 0; i < m; i++) {
            char ch = word1.charAt(i);
            int idx = ch - 'a';
            freq1[idx]++;
        }

        for (int i = 0; i < n; i++) {
            char ch = word2.charAt(i);
            int idx = ch - 'a';
            freq2[idx]++;
        }

        // Case 1: character presence must match
        for (int i = 0; i < 26; i++) {
            if ((freq1[i] == 0 && freq2[i] != 0) ||
                (freq1[i] != 0 && freq2[i] == 0)) {
                return false;
            }
        }

        // Case 2: frequency sets must match
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) return false;
        }

        return true;
    }
}