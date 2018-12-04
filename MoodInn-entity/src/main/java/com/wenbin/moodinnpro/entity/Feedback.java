package com.wenbin.moodinnpro.entity;


import java.util.Date;

public class Feedback {

  private int fbid;
  private int userid;
  private String fbcont;
  private Date fbdate;
  private Users users;

  public Feedback(int userid, String fbcont, Date fbdate, Users users) {
    this.userid = userid;
    this.fbcont = fbcont;
    this.fbdate = fbdate;
    this.users = users;
  }

  public Feedback() {
  }

  public Feedback(int fbid, int userid, String fbcont, Date fbdate, Users users) {
    this.fbid = fbid;
    this.userid = userid;
    this.fbcont = fbcont;
    this.fbdate = fbdate;
    this.users = users;
  }

  public int getFbid() {
    return fbid;
  }

  public void setFbid(int fbid) {
    this.fbid = fbid;
  }


  public int getUserid() {
    return userid;
  }

  public void setUserid(int userid) {
    this.userid = userid;
  }


  public String getFbcont() {
    return fbcont;
  }

  public void setFbcont(String fbcont) {
    this.fbcont = fbcont;
  }


  public Date getFbdate() {
    return fbdate;
  }

  public void setFbdate(Date fbdate) {
    this.fbdate = fbdate;
  }

}
