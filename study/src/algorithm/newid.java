package algorithm;

public class newid {
    static String solution(String str) {
        String answer = "";

//        1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        String str1 = str.toLowerCase();

//        2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            // 알파벳 소문자, 숫자, '-', '_', '.' 만 남기고 나머지는 제외
            if (Character.isLowerCase(ch) || Character.isDigit(ch) ||
                    ch == '-' || ch == '_' || ch == '.') {
                answer += ch;
            }
        }

//        3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        answer = answer.replaceAll("\\.{2,}", ".");

//        4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        if (answer.startsWith(".")) {
            answer = answer.substring(1);
        }
        if (answer.endsWith(".")) {
            answer = answer.substring(0, answer.length() - 1);
        }

//        5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if (answer.length()==0){
            answer = "a";
        }

//        6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
//     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        if (answer.length()>=16){
            answer = answer.substring(0,15);
            if (answer.endsWith(".")) {
                answer = answer.substring(0, answer.length() - 1);
            }
        }

//        7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        while (answer.length() <= 2){
            answer += answer.charAt(answer.length() - 1);
        }

        return answer;
    }

    public static void main(String[] args) {
//        String str = "...!@BaT#*..y.abcdefghijklm";
        String str = "z-+.^.";
        System.out.println(solution(str));
    }
}
