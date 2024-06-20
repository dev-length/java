package ch07.sec04.exam01;

public class Computer extends Calculator {
    //메소드오버라이딩
    @Override // 컴파일시정확히오버라이딩이되었는지체크해줌
    public double areaCircle(double r) {
        System.out.println("Computer 객체의areaCircle() 실행");
        return Math.PI * r * r;
    }
}
