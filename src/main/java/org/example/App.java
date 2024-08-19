package org.example;

import java.util.Scanner;

public class App {

    Scanner sc;
    App (Scanner sc){
        this.sc = sc;
    }

    void run(){
        System.out.println("== 게시판 앱 ==");
        int count = 1;
        while (true) {
            System.out.println("명령)");
            String command = sc.nextLine().trim();
            if (command.equals("종료")) {
                break;
            }
            else if (command.equals("등록")){
                System.out.println("제목:");
                String tit = sc.nextLine().trim();
                System.out.println("내용 : ");
                String det = sc.nextLine().trim();
                System.out.println(count + "번 개시물이 출렸되었습니다.");
                count++;
            }
        }
    }
}
