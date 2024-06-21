package ch08.sec11.exam02;

public class Bus implements Vehicle {
    //추상메소드재정의
    @Override
    public void run() {
        System.out.println("버스가달립니다.");
    }
}
