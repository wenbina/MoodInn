package com.wenbin.moodinnpro.dao;

import com.wenbin.moodinnpro.entity.Admins;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminDao {
    //查询全部管理员
    List<Admins> getAdminAll(@Param("adminno") String adminno, @Param("adminemail") String adminemail, @Param("adminname") String adminname, @Param("page") int page, @Param("limit") int limit);
    //查询管理员数量
    int getAdminCount(@Param("adminno") String adminno, @Param("adminemail") String adminemail, @Param("adminname") String adminname);
    //验证登陆
    int loginAdmin(Admins admins);
}
