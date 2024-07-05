package algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    static int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        long total1 = 0;
        long total2 = 0;
        long sum = 0;

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        // queue1 요소를 큐에 추가하고 합계를 계산
        for (int num : queue1) {
            q1.add(num);
            total1 += num;
            sum += num;
        }

        // queue2 요소를 큐에 추가하고 합계를 계산
        for (int num : queue2) {
            q2.add(num);
            total2 += num;
            sum += num;
        }

        // 총 합이 홀수이면 두 큐를 동일하게 나눌 수 없음
        if (sum % 2 != 0) {
            return -1;
        }

        long target = sum / 2;  // 목표 합계 설정
        int limit = queue1.length + queue2.length * 2;  // 최대 이동 횟수 설정

        // 두 큐의 합이 목표 합계와 같아질 때까지 요소 이동
        while (total1 != target && answer < limit) {
            if (total1 > target) {
                int value = q1.poll();  // q1에서 요소 제거
                total1 -= value;
                q2.add(value);  // q2에 요소 추가
                total2 += value;
            } else {
                int value = q2.poll();  // q2에서 요소 제거
                total2 -= value;
                q1.add(value);  // q1에 요소 추가
                total1 += value;
            }
            answer++;
        }

        // 최대 이동 횟수 초과 시 -1 반환
        if (total1 != target) {
            return -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 1, 2}, new int[]{1, 10, 1, 2}));
    }
}
