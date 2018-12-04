package com.wenbin.moodinnpro.dao;

import com.wenbin.moodinnpro.entity.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserDao {
    //selectAll
    List<Users> getUserAll();

    //查询全部用户
    List<Users> getAll(@Param("userno") String userno,@Param("useremail") String useremail,@Param("username") String username,@Param("page") int page,@Param("limit") int limit);

    //查询用户数量
    int getCountAll(@Param("userno") String userno,@Param("useremail") String useremail,@Param("username") String username);

    //insert
    int insertUser(Users users);

    //update
    int updateUser(Users users);

    //delete
    int deleteUser(int userid);

}
