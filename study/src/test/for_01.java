package test;

public class for_01 {
    public static void main(String[] args) {
        String star = "*";
        for(int i = 0; i < 5; i++) {
            for(int j = 5; j > i; j--) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
