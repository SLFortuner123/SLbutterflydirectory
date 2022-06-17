package com.slfortuner.slbutterflydirectory;

public class Messages {

    String article;
    String imageURL;

    public Messages() {

    }

    public Messages (String article, String imageURL){
        this.article =article;
        this.imageURL =imageURL;

    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
