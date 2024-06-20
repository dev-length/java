package ch07.sec08.exam01;

public class HankookTire  extends Tire {
    //메소드재정의(오버라이딩)
    @Override
    public void roll() {
        System.out.println("한국타이어가회전합니다.");
    }
}
