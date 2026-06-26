class Solution {
    public boolean isValid(String s) {
        Deque<Character> dq = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                dq.push(ch);
            } else {
                if (dq.isEmpty()) {
                    return false;
                }
                char c = dq.pop();
                if ((c == '(' && ch != ')') ||
                        (c == '{' && ch != '}') ||
                        (c == '[' && ch != ']')) {
                    return false;
                }
            }
        }
        return dq.isEmpty();

    }
}