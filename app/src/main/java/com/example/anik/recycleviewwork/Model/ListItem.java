package com.example.anik.recycleviewwork.Model;

/**
 * Created by Anik on 2/23/2017.
 */
//java representation our data  into recycleview
public class ListItem {
  private String title;
    private int imgResid;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImgResid() {
        return imgResid;
    }

    public void setImgResid(int imgResid) {
        this.imgResid = imgResid;
    }
}
