package oop;
import java.util.Date;

public class Post {
    private String title;
    private String createdAt;
    private int authorID;
    private String body;

    @Override
    public String toString() {
        return "PostTest{}";
    }

    //constructor -- same name as class
    //constructing hero?
    public Post(String title, String createdAt, int authorID, String body){
        this.title = title;
        this.createdAt = createdAt;
        this.authorID = authorID;
        this.body = body;
    }


    //gatekeepers to ensure the property doesn't change
    //getter and setter
    public String getThatTitle(){
        return this.title;
    }
    public void changeThatTitle(String title){
        this.title = title.toLowerCase();
    }


    //constructor and methods are public -- otherwise you cannot use them
    //



    public static void main(String[] args) {
        Post p = new Post(
                "Post 1",
                "01/01/1999",
                45,
                "THIS IS MY POST");
    }
}
