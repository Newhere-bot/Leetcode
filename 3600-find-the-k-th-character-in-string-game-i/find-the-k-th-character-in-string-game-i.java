class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");

        while (word.length() < k) {
            int n = word.length();

            for (int i = 0; i < n; i++) {
                char next = (char) (word.charAt(i) + 1);
                word.append(next);
            }
        }

        return word.charAt(k - 1);
    }
}