import java.util.*;

public class test {
    public static int[] solution(int[] arr) {
        List<Integer> resultList = new ArrayList<>();

        // 이전 숫자와 현재 숫자가 다를 경우에만 리스트에 추가
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                System.out.println(arr[i]);
                resultList.add(arr[i]);
            }
        }

        System.out.println(resultList+"!!");

        // 리스트를 배열로 변환
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 4, 4, 1, 1})));
    }
}
