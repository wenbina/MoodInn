package com.wenbin.moodinnpro.entity;


public class Users {

  private int userid;
  private String userno;
  private String useremail;
  private String userpwd;
  private String username;
  private String userhead;
  private String usertitle;
  private int userstate;

  public Users() {
  }

  public Users(String userno, String useremail, String userpwd, String username) {
    this.userno = userno;
    this.useremail = useremail;
    this.userpwd = userpwd;
    this.username = username;
  }


  @Override
  public String toString() {
    return "Users{" +
            "userid=" + userid +
            ", userno='" + userno + '\'' +
            ", useremail='" + useremail + '\'' +
            ", userpwd='" + userpwd + '\'' +
            ", username='" + username + '\'' +
            ", userhead='" + userhead + '\'' +
            ", usertitle='" + usertitle + '\'' +
            ", userstate=" + userstate +
            '}';
  }

  public int getUserid() {
    return userid;
  }

  public void setUserid(int userid) {
    this.userid = userid;
  }


  public String getUserno() {
    return userno;
  }

  public void setUserno(String userno) {
    this.userno = userno;
  }


  public String getUseremail() {
    return useremail;
  }

  public void setUseremail(String useremail) {
    this.useremail = useremail;
  }


  public String getUserpwd() {
    return userpwd;
  }

  public void setUserpwd(String userpwd) {
    this.userpwd = userpwd;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getUserhead() {
    return userhead;
  }

  public void setUserhead(String userhead) {
    this.userhead = userhead;
  }


  public String getUsertitle() {
    return usertitle;
  }

  public void setUsertitle(String usertitle) {
    this.usertitle = usertitle;
  }


  public int getUserstate() {
    return userstate;
  }

  public void setUserstate(int userstate) {
    this.userstate = userstate;
  }

}
