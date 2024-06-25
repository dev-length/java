package ch05.sec05;

public class LengthExample {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        int length = ssn.length();
        if(length == 13) {
            System.out.println("주민등록번호자릿수가맞습니다.");
        } else {
            System.out.println("주민등록번호자릿수가틀립니다.");
        }
    }
}
