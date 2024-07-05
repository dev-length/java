package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Service {
    static int[] solution(int[] progresses, int[] speeds) {
        int n = progresses.length;
        int[] answer = new int[n];
        List<Integer> result = new ArrayList<>();

        // 각 기능이 완료되는 날을 계산
        for (int i = 0; i < n; i++) {
            int remainingProgress = 100 - progresses[i];
            answer[i] = (int) Math.ceil((double) remainingProgress / speeds[i]);
        }

        int count = 1;
        int currentDeployDay = answer[0];

        for (int i = 1; i < n; i++) {
            if (answer[i] <= currentDeployDay) {
                count++;
            } else {
                result.add(count);
                count = 1;
                currentDeployDay = answer[i];
            }
        }
        // 마지막 배포 수 추가
        result.add(count);

        // List를 배열로 변환
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }

    public static void main(String[] args) {
//        int[] progresses = new int[]{93, 30, 55};
//        int[] speeds = new int[]{1, 30, 5};
//
//        // 결과 출력
//        int[] result = solution(progresses, speeds);
//        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(solution(new int[]{93, 30, 55},new int[]{1, 30, 5})));  // 예시 출력: [2, 1]
    }
}
