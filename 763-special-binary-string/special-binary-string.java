class Solution {
    public String makeLargestSpecial(String s) {
        int n = s.length();
        if (n == 2) {
            return s;
        }

        List<String> sub_strings = new ArrayList<>();
        int balance = 0, index = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                balance++;
            } else {
                balance--;
            }

            if (balance == 0) {
                String sub = s.substring(index, i + 1), inner = sub.substring(1, sub.length() - 1);
                String processed = makeLargestSpecial(inner);

                sub_strings.add('1' + processed + '0');

                index = i + 1;
            }
        }

        Collections.sort(sub_strings, Collections.reverseOrder());
        StringBuilder res = new StringBuilder();
        for (String sub : sub_strings) {
            res.append(sub);
        }

        return res.toString();
    }
}