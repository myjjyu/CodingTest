import java.util.Arrays;

// 자연수 뒤집어 배열로 만들기
public class 자연수_뒤집어_배열로_만들기02{
    public int[] solution(long n) {
        char[] c = String.valueOf(n).toCharArray();
        int size = c.length;
        int half = size / 2;

        for (int i = 0; i < half; i++) {
            int p = size - i - 1;

            char temp = c[i];
            c[i] = c[p];
            c[p] = temp;
        }
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = c[i] - '0';
        }
        return answer;
    }

    public static void main(String[] args) {
        long n = 12345;
        int[] result = new 자연수_뒤집어_배열로_만들기02().solution(n);
        System.out.println(Arrays.toString(result));
    }
}