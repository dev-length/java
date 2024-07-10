package algorithm;

import java.util.*;

public class priorities {
    static int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>(); // 인덱스를 저장하는 큐
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 우선순위 큐 (내림차순)

        // 큐에 인덱스를 저장하고, 우선순위 큐에는 우선순위를 저장
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(i);
            pq.offer(priorities[i]);
        }

        while (!queue.isEmpty()) {
            int idx = queue.poll(); // 현재 큐에서 꺼낸 인덱스

            // 현재 큐에서 가장 높은 우선순위를 가진 프로세스와 비교하여 실행 순서 결정
            if (priorities[idx] == pq.peek()) { // 현재 프로세스가 가장 높은 우선순위를 가질 경우
                pq.poll(); // 우선순위 큐에서 해당 우선순위 제거
                answer++; // 실행 순서 증가

                if (idx == location) { // 찾고자 하는 위치인 경우
                    break; // 반복 종료
                }
            } else { // 현재 프로세스가 가장 높은 우선순위를 가지지 않을 경우
                queue.offer(idx); // 다시 큐에 넣어서 대기
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 2}, 2)); // 예제 실행: 1
        System.out.println(solution(new int[]{1, 1, 9, 1, 1, 1}, 0)); // 예제 실행: 5
    }
}
