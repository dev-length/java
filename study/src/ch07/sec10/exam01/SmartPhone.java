package ch07.sec10.exam01;

public class SmartPhone extends Phone {
    //생성자선언
    SmartPhone(String owner) {
        //Phone 생성자호출
        super(owner);
    }
    //메소드선언
    void internetSearch() {
        System.out.println("인터넷검색을합니다.");
    }

}
