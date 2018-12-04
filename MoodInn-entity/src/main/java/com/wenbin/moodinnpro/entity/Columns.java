package com.wenbin.moodinnpro.entity;


import java.sql.Date;
import java.sql.Timestamp;

public class Columns {

  private int columnid;
  private String columnname;
  private int userid;
  private Date columndate;
  private String columntitle;
  private String columnhead;
  private String columnbg;
  private Users users;

  public Users getUsers() {
    return users;
  }

  public void setUsers(Users users) {
    this.users = users;
  }

  public Columns() {
  }

  public Columns(String columnname, int userid, Date columndate, String columntitle, String columnhead, String columnbg, Users users) {
    this.columnname = columnname;
    this.userid = userid;
    this.columndate = columndate;
    this.columntitle = columntitle;
    this.columnhead = columnhead;
    this.columnbg = columnbg;
    this.users = users;
  }

  public Columns(int columnid, String columnname, int userid, Date columndate, String columntitle, String columnhead, String columnbg, Users users) {
    this.columnid = columnid;
    this.columnname = columnname;
    this.userid = userid;
    this.columndate = columndate;
    this.columntitle = columntitle;
    this.columnhead = columnhead;
    this.columnbg = columnbg;
    this.users = users;
  }

  public int getColumnid() {
    return columnid;
  }

  public void setColumnid(int columnid) {
    this.columnid = columnid;
  }


  public String getColumnname() {
    return columnname;
  }

  public void setColumnname(String columnname) {
    this.columnname = columnname;
  }


  public int getUserid() {
    return userid;
  }

  public void setUserid(int userid) {
    this.userid = userid;
  }


  public Date getColumndate() {
    return columndate;
  }

  public void setColumndate(Date columndate) {
    this.columndate = columndate;
  }


  public String getColumntitle() {
    return columntitle;
  }

  public void setColumntitle(String columntitle) {
    this.columntitle = columntitle;
  }


  public String getColumnhead() {
    return columnhead;
  }

  public void setColumnhead(String columnhead) {
    this.columnhead = columnhead;
  }


  public String getColumnbg() {
    return columnbg;
  }

  public void setColumnbg(String columnbg) {
    this.columnbg = columnbg;
  }

}
