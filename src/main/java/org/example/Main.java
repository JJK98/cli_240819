package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("== 게시판 앱 ==");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("명령)");
            String command = sc. nextLine();

            if (command.equals("종료")){
                break;
            }
        }
    }
}