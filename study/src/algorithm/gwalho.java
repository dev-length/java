package algorithm;

import java.util.ArrayDeque;
import java.util.Deque;

public class gwalho{
    static boolean solution(String s) {
        boolean answer = true;
        Deque<Character> stack = new ArrayDeque<>();

//        처음과 끝을 확인 함
//        if (s.charAt(0) == ')' || s.charAt(s.length()-1) == '(') return false;


        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == '('){
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        answer = stack.isEmpty();
        return answer;
    }
}