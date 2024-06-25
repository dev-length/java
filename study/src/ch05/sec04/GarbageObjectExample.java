package ch05.sec04;

public class GarbageObjectExample {
    public static void main(String[] args) {
        String hobby = "여행";
        hobby = null; // "여행"에해당하는String 객체를쓰레기로만듦
        String kind1 = "자동차";
        String kind2 = kind1; // kind1 변수에저장되어있는번지를kind2 변수에대입
        kind1 = null; // "자동차"에해당하는String 객체는쓰레기가아님
        System.out.println("kind2: " + kind2);
    }
}
