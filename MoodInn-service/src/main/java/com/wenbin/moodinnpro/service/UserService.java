package com.wenbin.moodinnpro.service;

import com.wenbin.moodinnpro.entity.Users;

import java.util.List;

public interface UserService {
    //getAll
    List<Users> getUserAll();

    //查询全部用户
    List<Users> getAll( String userno,String useremail,String username,int page,int limit);

    //查询用户数量
    int getCountAll( String userno,String useremail,String username);

    //insert
    int insertUser(Users users);

    //update
    int updateUser(Users users);

    //delete
    int deleteUser(int userid);

}
