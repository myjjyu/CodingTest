import java.util.ArrayDeque;
import java.util.Deque; 

class Solution {
    public int solution(String s) {
      // 문자를 저장할 스택 초기화
      Deque<Character> deque = new ArrayDeque<>();

      // 문자열의 각 문자에 대해 반복
      for (char c : s.toCharArray()) {
        if (!deque.isEmpty() && deque.peekFirst() == c) {
          deque.pollFirst();
        } else {
          deque.addFirst(c);
        }
      }
      // 스택이 비어 있으면 모든 문자를 짝지어 제거할 수 있었음을 의미하므로 1
      // 스택이 비어 있지 않으면 짝지어 제거할 수 없는 문자가 남아 있음을 의미하므로 0
      return deque.isEmpty() ? 1 : 0;
    }
  }