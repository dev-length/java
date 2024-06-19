package test;

import java.util.Scanner;

public class Scanner_01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int money = 0;


        while(true) {
            System.out.println("1.예금 || 2.출금 || 3.잔고 || 4.종료");
            int input = sc.nextInt();
            if(input == 1){
                System.out.println("선택> 1");
                System.out.print("예금액>");
                int input2 = sc.nextInt();
                money += input2;
            } else if (input == 2) {
                System.out.println("선택> 2");
                System.out.print("출금액>");
                int input2 = sc.nextInt();
                money -= input2;
            } else if (input == 3) {
                System.out.println("선택> 3");
                System.out.println("잔고>" + money);
            } else if (input == 4) {
                System.out.println("선택> 4");
                System.out.println(" ");
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
