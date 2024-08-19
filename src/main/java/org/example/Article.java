package org.example;

public class Article {
    private int id;
    private String title;
    private String detail;

    Article(int id, String title, String detail){
        this.id =id;
        this.title = title;
        this.detail = detail;


    }


    public int getid(){
        return this.id;
    }
    public String getTitle(){
        return this.title;
    }
    public String getDetail(){
        return this.detail;
    }

}
