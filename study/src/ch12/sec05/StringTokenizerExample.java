package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String data1 = "홍길동&이수홍,박연수";
        String[] arr = data1.split("&|,");
        for(String token : arr) {
            System.out.println(token);
        }
        System.out.println();
        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer st = new StringTokenizer(data2, "/");
//        hasMoreTokens : 다음 요소가 있는지 boolean 값으로 변환
        while (st.hasMoreTokens()) {
//            nextToken : 실제로 다음에 있는 요소를 가져온다.
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
