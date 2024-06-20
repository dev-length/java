package ch07.sec07.exam03;

public class Child extends Parent {
    //필드선언
    public String field2;
    //메소드오버라이딩
    @Override
    public void method2() {
        System.out.println("Child-method2()");
    }
    //메소드선언
    public void method3() {
        System.out.println("Child-method3()");
    }
}
