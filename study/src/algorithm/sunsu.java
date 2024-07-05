package algorithm;

import java.util.HashMap;

public class sunsu {
    public String solution(String[] participant, String[] completion) {
        // 참가자 명단을 해시 맵에 저장합니다.
        HashMap<String, Integer> participantMap = new HashMap<>();
        for (String part : participant) {
            participantMap.put(part, participantMap.getOrDefault(part, 0) + 1);
        }

        // 완주자 명단을 해시 맵에서 뺍니다.
        for (String comp : completion) {
            participantMap.put(comp, participantMap.get(comp) - 1);
        }

        // 해시 맵에서 값이 0이 아닌 단 한 명을 찾아냅니다.
        for (String key : participantMap.keySet()) {
            if (participantMap.get(key) != 0) {
                return key;
            }
        }

        return null; // 모든 선수가 완주한 경우, 문제의 제약사항에 의해 이 코드에는 도달하지 않습니다.
    }

    public static void main(String[] args) {
        // 예제 테스트
//        Solution sol = new Solution();
//        System.out.println(sol.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));  // "leo"
//        System.out.println(sol.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}));  // "vinko"
//        System.out.println(sol.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));  // "mislav"
    }

}
