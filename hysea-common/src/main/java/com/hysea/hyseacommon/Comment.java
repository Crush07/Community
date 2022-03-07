package com.hysea.hyseacommon;


import java.util.Date;
import java.util.List;

public class Comment {

  private long id;
  private long uid;
  private String text;
  private Date time;
  private long level;
  private long praise;
  private long oppose;

  private List<Comment> childComment;

  public List<Comment> getChildComment() {
    return childComment;
  }

  public void setChildComment(List<Comment> childComment) {
    this.childComment = childComment;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getPraise() {
    return praise;
  }

  public void setPraise(long praise) {
    this.praise = praise;
  }

  public long getOppose() {
    return oppose;
  }

  public void setOppose(long oppose) {
    this.oppose = oppose;
  }

  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
    this.time = time;
  }

  public long getLevel() {
    return level;
  }

  public void setLevel(long level) {
    this.level = level;
  }

}
