class Solution {
    public int magicalString(int n) {
        if (n == 0) return 0;
        if (n <= 3) return 1;

        StringBuilder s = new StringBuilder("122");
        int p = 2;
        char last_char = '2';

        while (s.length() < n) {
            int repeat = s.charAt(p) - '0';
            char next_char = (last_char == '1') ? '2' : '1';

            for (int i = 0; i < repeat; i++) {
                s.append(next_char);
            }

            last_char = next_char;
            p++;
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') count++;
        }

        return count;
    }
}