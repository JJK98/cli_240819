package org.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class App {

    Scanner sc;
    App (Scanner sc){
        this.sc = sc;
    }

    void run(){
        System.out.println("== 게시판 앱 ==");
        int count = 1;
        List<Article> articleList = new ArrayList<>();
//        List<String> title = new ArrayList<>();
//        List<String> detail = new ArrayList<>();
        while (true) {
            System.out.print("명령)");
            String command = sc.nextLine().trim();
            if (command.equals("종료")) {
                break;
            }
            else if (command.equals("등록")){
                System.out.print("제목:");
                String tit = sc.nextLine().trim();

                System.out.print("내용 : ");
                String det = sc.nextLine().trim();


                Article article = new Article(count, tit, det);
                articleList.add(article);

                System.out.println(count + "번 개시물이 출력되었습니다.");
                count++;
            }
            else if (command.equals("목록")){
                for(int i = count-1; i>=1; i--){
                    Article article =  articleList.get(i-1);
                    System.out.printf("%d, %s, %s\n", article.getid(), article.getTitle(), article.getDetail());
                }
            }
        }
    }
}


