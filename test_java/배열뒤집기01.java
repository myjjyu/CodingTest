import java.util.Arrays;

// 배열 조각하기
public class 배열뒤집기01 {
    public int[] solution(int[] arr, int[] query) {
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                arr = Arrays.copyOfRange(arr, 0, query[i] + 1);
            } else {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        배열뒤집기01 test = new 배열뒤집기01();
        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] query = {4, 1, 2};
        int[] result = test.solution(arr, query);
        System.out.println(Arrays.toString(result));
    }
}