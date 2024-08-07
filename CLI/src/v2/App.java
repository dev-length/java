package v2;

import java.util.Scanner;

public class App {
    int studentNum = 0;
    int[] scores = null;

    Scanner scanner = new Scanner(System.in);

    Menu menu;
    public App() {
        menu = new Menu();
    }

    public void printMenu() {
        System.out.println("--------------------------------------------------------------");
        System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
        System.out.println("--------------------------------------------------------------");
    }

    private void analize() {
        int max = 0;
        int sum = 0;
        double avg = 0;
        for(int i=0; i<scores.length; i++) {
            max = (max<scores[i])? scores[i] : max;
            sum += scores[i];
        }
        avg = (double) sum / studentNum;
        System.out.println("최고 점수: " + max);
        System.out.println("평균 점수: " + avg);
    }

    public void getStudentNum() {
        System.out.print("학생수> ");
        studentNum = Integer.parseInt(scanner.nextLine());
        scores = new int[studentNum];
    }
    public void getScores() {
        for(int i=0; i<scores.length; i++) {
            System.out.print("scores[" + i + "]> ");
            scores[i] = Integer.parseInt(scanner.nextLine());
        }
    }
    public void printScore() {
        for(int i=0; i<scores.length; i++) {
            System.out.println("scores[" + i + "]: " + scores[i]);
        }
    }
//    public void exit() {
//        run = false;
//    }
    public void executeCommand(int selectNo) {
        if (selectNo == 1) {
            getStudentNum();
        } else if (selectNo == 2) {
            getScores();
        } else if (selectNo == 3) {
            printScore();
        } else if (selectNo == 4) {
            analize();
        }
    }

    public void run() {
        while(true) {
            menu.printMenu();
            int selectNo = menu.getSelect();
            executeCommand(selectNo);
            if (selectNo == 5) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        v2.App app = new v2.App();
        app.run();
    }
}
