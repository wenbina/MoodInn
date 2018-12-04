package com.wenbin.moodinnpro.service;

import com.wenbin.moodinnpro.entity.Admins;

import java.util.List;

public interface AdminService {
    //查询全部管理员
    List<Admins> getAdminAll(String adminno,String adminemail, String adminname,int page,int limit);
    //查询管理员数量
    int getAdminCount(String adminno,String adminemail,String adminname);
    //    验证登陆
    int loginAdmin(Admins admins);
}
