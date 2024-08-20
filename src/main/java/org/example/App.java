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
                for(int i = articleList.size(); i>=1; i--){
                    Article article =  articleList.get(i-1);
                    System.out.printf("%d, %s, %s\n", article.getid(), article.getTitle(), article.getDetail());
                }
            }
            else if (command.startsWith("삭제")) {

                String[] commandList = command.split("\\?",2);

                String actionCode = commandList[0];
                String[] paramsStr = commandList[1].split("=", 2);


                String key = paramsStr[0];
                String value = paramsStr[1];
                int idx = Integer.parseInt(value);

                Article article = null;
                for (int i =0; i < articleList.size(); i++){

                    if(articleList.get(i).getid() == idx){

                        article = articleList.get(i);
                    }
                }
                if(article == null){
                    System.out.printf("%d 번 개시물은 존재하지 않습니다.\n", idx);
                    continue;
                }
                else{
                    articleList.remove(article);
                    System.out.printf("%d 번 게시물이 삭제되었습니다.\n", idx);}
            }


            else if(command.startsWith("수정")){
                String[] commandList = command.split("\\?",2);

                String actionCode = commandList[0];
                String[] paramsStr = commandList[1].split("=", 2);


                String key = paramsStr[0];
                String value = paramsStr[1];
                int idx = Integer.parseInt(value);
                for (int i =0; i < articleList.size(); i++){

                    if(articleList.get(i).getid() == idx){
                        System.out.print("제목:");
                        String tit = sc.nextLine().trim();

                        System.out.print("내용 : ");
                        String det = sc.nextLine().trim();


                        Article article = new Article(articleList.get(i).getid(), tit, det);
                        articleList.set(i, article);

                    }
                }
                System.out.printf("%d 번 게시물이 수정되었습니다.\n", idx);
            }


//            else {
//                System.out.println("알 수 없는 명령어입니다.");
//         }
        }
    }
}


