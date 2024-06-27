package ch12.sec06;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        //Boxing (primitive > wrapper)
        Integer obj = 100;
        System.out.println("value: " + obj.intValue());
        //Unboxing (wrapper > primitive)
        int value = obj;
        System.out.println("value: " + value);
        //연산시 Unboxing
        int result = obj + 100;
        System.out.println("result: " + result);
    }
}
