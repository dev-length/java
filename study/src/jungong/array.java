package jungong;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 좌석 배열 초기화 (10개의 좌석, 각 좌석은 A, B, C 열 중 하나의 예약 상태를 가짐)
        String[][] seats = new String[10][3];

        int check = 0;

        // 좌석 초기화 (빈 좌석은 "0"으로 표시)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                seats[i][j] = "0";
            }
        }

        while (true) {

            // 현재 좌석 상태 출력
            System.out.println("현재 좌석 상태:");
            for (int i = 0; i < 10; i++) {
                System.out.println((i + 1) + ": A:" + seats[i][0] + " B:" + seats[i][1] + " C:" + seats[i][2]);
            }

            // 예매할 좌석 번호 입력
            System.out.print("예매할 좌석 번호를 입력하세요 (종료하려면 0 입력): ");
            int sit = sc.nextInt();

            // 종료 조건 확인
            if (sit == 0) {

                System.out.println("예매된 좌석 수: " + check);

                System.out.println("총 예매 금액: " + check*10000);

                break;
            }

            // 잘못된 좌석 번호 입력 시 재입력 요청
            if (sit < 1 || sit > 10) {
                System.out.println("잘못된 좌석 번호입니다. 다시 입력하세요.");
                continue;
            }

            // 예매할 열 선택
            System.out.print("예매할 열을 선택하세요 (A, B, C 중 하나 입력): ");
            String width = sc.next().toUpperCase();

            // 잘못된 열 입력 시 재입력 요청
            if (!width.equals("A") && !width.equals("B") && !width.equals("C")) {
                System.out.println("잘못된 열입니다. 다시 입력하세요.");
                continue;
            }

            // 열에 따른 인덱스 설정
            int colIndex = width.equals("A") ? 0 : (width.equals("B") ? 1 : 2);

            // 선택한 좌석이 이미 예약되었는지 확인
            if (seats[sit - 1][colIndex].equals("1")) {
                System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택하세요.");
            } else {
                // 좌석 예약
                seats[sit - 1][colIndex] = "1";
                System.out.println(sit + width + "좌석이 예매되었습니다.");
                check++;
            }
        }
        sc.close();
    }
}
