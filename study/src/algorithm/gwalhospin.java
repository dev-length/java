package algorithm;

import java.util.Stack;

public class gwalhospin {
    // 문자열 s가 올바른 괄호 문자열인지 판단하는 함수
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    // 문자열 s를 왼쪽으로 회전시켜가며 검사하여 올바른 괄호 문자열의 개수를 반환
    public static int solution(String s) {
        int answer = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if (isValid(rotated)) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("[](){}")); // 예시 출력: 3
    }
}
