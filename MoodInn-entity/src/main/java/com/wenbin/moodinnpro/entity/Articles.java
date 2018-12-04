package com.wenbin.moodinnpro.entity;


import java.sql.Timestamp;
import java.util.Date;

public class Articles {

  private int articleid;
  private String articletitle;
  private String articlecont;
  private int columnid;
  private int userid;
  private Date articledate;
  private int articlebrow;
  private Users users;
  private Columns columns;

  public Articles() {
  }

  public Articles(String articletitle, String articlecont, int columnid, int userid, Date articledate, int articlebrow, Users users, Columns columns) {
    this.articletitle = articletitle;
    this.articlecont = articlecont;
    this.columnid = columnid;
    this.userid = userid;
    this.articledate = articledate;
    this.articlebrow = articlebrow;
    this.users = users;
    this.columns = columns;
  }

  public Articles(int articleid, String articletitle, String articlecont, int columnid, int userid, Date articledate, int articlebrow, Users users, Columns columns) {
    this.articleid = articleid;
    this.articletitle = articletitle;
    this.articlecont = articlecont;
    this.columnid = columnid;
    this.userid = userid;
    this.articledate = articledate;
    this.articlebrow = articlebrow;
    this.users = users;
    this.columns = columns;
  }

  public Users getUsers() {
    return users;
  }

  public void setUsers(Users users) {
    this.users = users;
  }

  public Columns getColumns() {
    return columns;
  }

  public void setColumns(Columns columns) {
    this.columns = columns;
  }

  public int getArticleid() {
    return articleid;
  }

  public void setArticleid(int articleid) {
    this.articleid = articleid;
  }


  public String getArticletitle() {
    return articletitle;
  }

  public void setArticletitle(String articletitle) {
    this.articletitle = articletitle;
  }


  public String getArticlecont() {
    return articlecont;
  }

  public void setArticlecont(String articlecont) {
    this.articlecont = articlecont;
  }


  public int getColumnid() {
    return columnid;
  }

  public void setColumnid(int columnid) {
    this.columnid = columnid;
  }


  public int getUserid() {
    return userid;
  }

  public void setUserid(int userid) {
    this.userid = userid;
  }


  public Date getArticledate() {
    return articledate;
  }

  public void setArticledate(Date articledate) {
    this.articledate = articledate;
  }


  public int getArticlebrow() {
    return articlebrow;
  }

  public void setArticlebrow(int articlebrow) {
    this.articlebrow = articlebrow;
  }

}
