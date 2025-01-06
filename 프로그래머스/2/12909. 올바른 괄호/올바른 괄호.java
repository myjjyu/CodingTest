import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        // 빈 스택을 생성 --> 여는 괄호를 저장할는 용도
        Deque<Character> deque = new ArrayDeque<>();

        // 문자열 s의 각 글자를 순회
        for (char ch : s.toCharArray()){
          if(ch == '('){    // 여는 괄호인 경우
            deque.add(ch);  // 스택에 추가
          } else if(ch == ')') {          // 닫는 괄호인 경우
            if(deque.isEmpty()){          // 스택이 비어있으면,
              return false;               // false 반환
            } else {
              deque.removeLast();           // 스택에서 여는 괄호를(pop) 하여 짝을 맞춤
            }
          }
        }
        // 문자열 s의 모든 문자를 순회한 후,  스택이 비어있는지 확인
        // --> 올바른 괄호 문자열이라면 최종적으로는 스택이 비어 있어야함 

        return deque.isEmpty();
    }
}